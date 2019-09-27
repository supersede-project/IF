var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":297,"id":7730,"methods":[{"el":70,"sc":2,"sl":63},{"el":87,"sc":2,"sl":72},{"el":104,"sc":2,"sl":89},{"el":123,"sc":2,"sl":106},{"el":130,"sc":2,"sl":125},{"el":137,"sc":2,"sl":132},{"el":149,"sc":2,"sl":139},{"el":163,"sc":2,"sl":151},{"el":170,"sc":2,"sl":165},{"el":185,"sc":2,"sl":179},{"el":212,"sc":2,"sl":187},{"el":223,"sc":2,"sl":214},{"el":242,"sc":2,"sl":225},{"el":253,"sc":2,"sl":244},{"el":264,"sc":2,"sl":255},{"el":283,"sc":2,"sl":266},{"el":295,"sc":2,"sl":285}],"name":"ModelRepositoryProxyTest","sl":57}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":165}],"name":"testGetBaseModelsForSystem","pass":true,"statements":[{"sl":167},{"sl":168},{"sl":169}]},"test_11":{"methods":[{"sl":132}],"name":"testGetAllFCModels","pass":true,"statements":[{"sl":134},{"sl":135},{"sl":136}]},"test_115":{"methods":[{"sl":106},{"sl":187},{"sl":214},{"sl":225},{"sl":244}],"name":"testCreateUpdateAndDeleteAdaptationModel","pass":true,"statements":[{"sl":109},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":116},{"sl":117},{"sl":118},{"sl":121},{"sl":188},{"sl":189},{"sl":190},{"sl":192},{"sl":194},{"sl":195},{"sl":197},{"sl":199},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":206},{"sl":207},{"sl":209},{"sl":211},{"sl":215},{"sl":217},{"sl":218},{"sl":219},{"sl":220},{"sl":222},{"sl":226},{"sl":227},{"sl":228},{"sl":230},{"sl":231},{"sl":232},{"sl":233},{"sl":234},{"sl":235},{"sl":236},{"sl":237},{"sl":238},{"sl":239},{"sl":241},{"sl":245},{"sl":246},{"sl":249},{"sl":250},{"sl":251},{"sl":252}]},"test_119":{"methods":[{"sl":151}],"name":"testGetAllBaseModelsWithQueryMetadata","pass":true,"statements":[{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":159},{"sl":161},{"sl":162}]},"test_134":{"methods":[{"sl":89},{"sl":255},{"sl":266},{"sl":285}],"name":"testCreateGetAndDeleteBaseModel","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":99},{"sl":100},{"sl":103},{"sl":256},{"sl":258},{"sl":259},{"sl":260},{"sl":261},{"sl":263},{"sl":267},{"sl":268},{"sl":269},{"sl":271},{"sl":272},{"sl":273},{"sl":274},{"sl":275},{"sl":276},{"sl":277},{"sl":278},{"sl":279},{"sl":280},{"sl":282},{"sl":286},{"sl":287},{"sl":290},{"sl":291},{"sl":292},{"sl":293},{"sl":294}]},"test_15":{"methods":[{"sl":72},{"sl":214},{"sl":225},{"sl":244}],"name":"testCreateGetAndDeleteAdaptationModel","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":82},{"sl":83},{"sl":86},{"sl":215},{"sl":217},{"sl":218},{"sl":219},{"sl":220},{"sl":222},{"sl":226},{"sl":227},{"sl":228},{"sl":230},{"sl":231},{"sl":232},{"sl":233},{"sl":234},{"sl":235},{"sl":236},{"sl":237},{"sl":238},{"sl":239},{"sl":241},{"sl":245},{"sl":246},{"sl":249},{"sl":250},{"sl":251},{"sl":252}]},"test_29":{"methods":[{"sl":125}],"name":"testGetAllAdaptationModels","pass":true,"statements":[{"sl":127},{"sl":128},{"sl":129}]},"test_5":{"methods":[{"sl":179}],"name":"getModelInstance","pass":true,"statements":[{"sl":181},{"sl":182},{"sl":184}]},"test_68":{"methods":[{"sl":139}],"name":"testGetAllBaseModels","pass":true,"statements":[{"sl":141},{"sl":142},{"sl":143},{"sl":145},{"sl":147},{"sl":148}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [15], [], [], [15], [15], [15], [15], [15], [], [], [15], [15], [], [], [15], [], [], [134], [], [], [134], [134], [134], [134], [134], [], [], [134], [134], [], [], [134], [], [], [115], [], [], [115], [115], [115], [115], [115], [], [], [115], [115], [115], [], [], [115], [], [], [], [29], [], [29], [29], [29], [], [], [11], [], [11], [11], [11], [], [], [68], [], [68], [68], [68], [], [68], [], [68], [68], [], [], [119], [], [119], [119], [119], [119], [119], [], [119], [], [119], [119], [], [], [1], [], [1], [1], [1], [], [], [], [], [], [], [], [], [], [5], [], [5], [5], [], [5], [], [], [115], [115], [115], [115], [], [115], [], [115], [115], [], [115], [], [115], [115], [115], [115], [115], [115], [115], [115], [115], [], [115], [], [115], [], [], [15, 115], [15, 115], [], [15, 115], [15, 115], [15, 115], [15, 115], [], [15, 115], [], [], [15, 115], [15, 115], [15, 115], [15, 115], [], [15, 115], [15, 115], [15, 115], [15, 115], [15, 115], [15, 115], [15, 115], [15, 115], [15, 115], [15, 115], [], [15, 115], [], [], [15, 115], [15, 115], [15, 115], [], [], [15, 115], [15, 115], [15, 115], [15, 115], [], [], [134], [134], [], [134], [134], [134], [134], [], [134], [], [], [134], [134], [134], [134], [], [134], [134], [134], [134], [134], [134], [134], [134], [134], [134], [], [134], [], [], [134], [134], [134], [], [], [134], [134], [134], [134], [134], [], [], []]
