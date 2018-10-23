#!/bin/bash
set -e # Any subsequent(*) commands which fail will cause the shell script to exit immediately

#Cleanup
mvn clean package -DskipTests

#Configuration
DATE=`date '+%Y%m%d%H%M'`
RESULTS_DIR=/home/stamp/Git/descartes-usecases-output/atos/supersede/if/mutation-score/baseline/descartes/$DATE/
OUT=./target/pit-reports/$DATE/*
LOG=$DATE"_descartes.log"
mkdir -p $RESULTS_DIR

#Descartes Execution
nohup time mvn -f pom_descartes.xml org.pitest:pitest-maven:mutationCoverage -DmutationEngine=descartes | tee -a $LOG &
pid=$!
((pid--)) #Decremented to capture mvn command pid, otherwise it captures tee command pid
wait $pid

#Collecting results
#This will output an html report to target/pit-reports/<YYYYMMDDHHMI>.
mv $OUT $RESULTS_DIR
mv $LOG $RESULTS_DIR