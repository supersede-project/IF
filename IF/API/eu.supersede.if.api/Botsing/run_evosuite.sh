java -d64 -Xmx4000m -jar supersede-if-botsing/evosuite-master-1.0.7-SNAPSHOT.jar \
	-class "eu.supersede.integration.api.security.test.IFAuthenticationManagerTest" \
	-projectCP "$(cat classpath.txt)" \
	-generateMOSuite \
	-Dalgorithm=DynaMOSA \
	-Dsearch_budget=60 \
	-Dseed_clone="0.5" \
	-Donline_model_seeding=TRUE \
	-Dmodel_path="models" \
	-Dtest_dir="evosuite-tests" \
	-Dreport_dir="evosuite-report" \
	-Dno_runtime_dependency=true