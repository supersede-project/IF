package eu.supersede.integration.api.replan.optimizer.proxies.test;


import eu.supersede.integration.api.replan.optimizer_v2.proxies.IReplanOptimizer;
import eu.supersede.integration.api.replan.optimizer_v2.proxies.ReplanOptimizerProxy;
import eu.supersede.integration.api.replan.optimizer_v2.types.Feature;
import eu.supersede.integration.api.replan.optimizer_v2.types.NextReleaseProblem;
import eu.supersede.integration.api.replan.optimizer_v2.types.Priority;
import eu.supersede.integration.api.replan.optimizer_v2.types.Resource;
import eu.supersede.integration.api.replan.optimizer_v2.types.Skill;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AmplReplanOptimizerV2ProxyTest {
    private static final Logger log = LoggerFactory.getLogger(AmplReplanOptimizerV2ProxyTest.class);

    private static IReplanOptimizer proxy;

    @BeforeClass
    public static void setup() throws Exception {
        AmplReplanOptimizerV2ProxyTest.proxy = new ReplanOptimizerProxy();
    }

    private NextReleaseProblem createNextReleaseProblem() {
        NextReleaseProblem nrProblem = new NextReleaseProblem();
        nrProblem.setHoursPerWeek(40.0);
        nrProblem.setNbWeeks(1);
        nrProblem.getFeatures().addAll(createFeatures());
        nrProblem.getResources().addAll(createResources());
        return nrProblem;
    }

    private Collection<Feature> createFeatures() {
        Skill s4 = new Skill();
        s4.setName("4");
        Priority priority = new Priority();
        priority.setLevel(2);
        priority.setScore(2);
        List<Feature> features = new ArrayList<>();
        Feature f9 = createFeature9(s4, priority);
        features.add(f9);
        Feature f10 = createFeature10(f9, s4, priority);
        features.add(f10);
        Feature f11 = createFeature11(f9, s4, priority);
        features.add(f11);
        Feature f12 = createFeature12(f10, s4, priority);
        features.add(f12);
        return features;
    }

    private Feature createFeature9(Skill s4, Priority priority) {
        Feature f = new Feature();
        f.setName("9");
        f.setDuration(9.0);
        f.setPriority(priority);
        List<Skill> skills = new ArrayList<>();
        Skill s = new Skill();
        s.setName("2");
        skills.add(s);
        f.getRequiredSkills().addAll(skills);
        return f;
    }

    private Feature createFeature10(Feature f9, Skill s4, Priority priority) {
        Feature f = new Feature();
        f.setName("10");
        f.setDuration(12.0);
        f.setPriority(priority);
        List<Skill> skills = new ArrayList<>();
        skills.add(s4);
        f.getRequiredSkills().addAll(skills);
        f.getDependencies().add(f9);
        return f;
    }

    private Feature createFeature11(Feature f9, Skill s4, Priority priority) {
        Feature f = new Feature();
        f.setName("11");
        f.setDuration(8.0);
        f.setPriority(priority);
        List<Skill> skills = new ArrayList<>();
        skills.add(s4);
        f.getRequiredSkills().addAll(skills);
        f.getDependencies().add(f9);
        return f;
    }

    private Feature createFeature12(Feature f10, Skill s4, Priority priority) {
        Feature f = new Feature();
        f.setName("12");
        f.setDuration(10.0);
        f.setPriority(priority);
        List<Skill> skills = new ArrayList<>();
        skills.add(s4);
        f.getRequiredSkills().addAll(skills);
        f.getDependencies().add(f10);
        return f;
    }

    private Collection<Resource> createResources() {
        List<Resource> resources = new ArrayList<>();
        Skill s1 = new Skill();
        s1.setName("1");
        Skill s2 = new Skill();
        s2.setName("2");
        Skill s4 = new Skill();
        s4.setName("4");
        Resource r1 = new Resource();
        r1.setName("1");
        r1.setAvailability(20.0);
        List<Skill> skills = new ArrayList<>();
        skills.add(s1);
        skills.add(s2);
        skills.add(s4);
        r1.getSkills().addAll(skills);
        resources.add(r1);
        Resource r2 = new Resource();
        r2.setName("2");
        r2.setAvailability(40.0);
        skills = new ArrayList<>();
        skills.add(s1);
        skills.add(s4);
        r2.getSkills().addAll(skills);
        resources.add(r2);
        return resources;
    }
}

