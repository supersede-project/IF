var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":113,"id":1123,"methods":[{"el":7,"sc":2,"sl":5},{"el":11,"sc":2,"sl":9},{"el":15,"sc":2,"sl":13},{"el":19,"sc":2,"sl":17},{"el":23,"sc":2,"sl":21},{"el":27,"sc":2,"sl":25},{"el":31,"sc":2,"sl":29},{"el":35,"sc":2,"sl":33},{"el":39,"sc":2,"sl":37},{"el":43,"sc":2,"sl":41},{"el":47,"sc":2,"sl":45},{"el":51,"sc":2,"sl":49},{"el":55,"sc":2,"sl":53},{"el":59,"sc":2,"sl":57},{"el":63,"sc":2,"sl":61},{"el":67,"sc":2,"sl":65},{"el":71,"sc":2,"sl":69},{"el":75,"sc":2,"sl":73},{"el":87,"sc":2,"sl":87},{"el":111,"sc":2,"sl":89}],"name":"UserRequest","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_109":{"methods":[{"sl":9},{"sl":17},{"sl":25},{"sl":33},{"sl":41},{"sl":49},{"sl":57},{"sl":65},{"sl":73},{"sl":87}],"name":"testParsingAlerts","pass":true,"statements":[{"sl":10},{"sl":18},{"sl":26},{"sl":34},{"sl":42},{"sl":50},{"sl":58},{"sl":66},{"sl":74}]},"test_120":{"methods":[{"sl":5},{"sl":13},{"sl":21},{"sl":29},{"sl":37},{"sl":45},{"sl":53},{"sl":61},{"sl":69},{"sl":89}],"name":"testNotifyAlert","pass":true,"statements":[{"sl":6},{"sl":14},{"sl":22},{"sl":30},{"sl":38},{"sl":46},{"sl":54},{"sl":62},{"sl":70},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109}]},"test_21":{"methods":[{"sl":5},{"sl":9},{"sl":13},{"sl":17},{"sl":21},{"sl":25},{"sl":29},{"sl":33},{"sl":37},{"sl":41},{"sl":45},{"sl":49},{"sl":53},{"sl":57},{"sl":61},{"sl":65},{"sl":69},{"sl":73},{"sl":87},{"sl":89}],"name":"testPublishAlertMessage","pass":true,"statements":[{"sl":6},{"sl":10},{"sl":14},{"sl":18},{"sl":22},{"sl":26},{"sl":30},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":62},{"sl":66},{"sl":70},{"sl":74},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109}]},"test_35":{"methods":[{"sl":5},{"sl":9},{"sl":13},{"sl":17},{"sl":21},{"sl":25},{"sl":29},{"sl":33},{"sl":37},{"sl":41},{"sl":45},{"sl":49},{"sl":53},{"sl":57},{"sl":61},{"sl":65},{"sl":69},{"sl":73},{"sl":87},{"sl":89}],"name":"testPublishEvolutionAlertMessage","pass":true,"statements":[{"sl":6},{"sl":10},{"sl":14},{"sl":18},{"sl":22},{"sl":26},{"sl":30},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":62},{"sl":66},{"sl":70},{"sl":74},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [120, 35, 21], [120, 35, 21], [], [], [109, 35, 21], [109, 35, 21], [], [], [120, 35, 21], [120, 35, 21], [], [], [109, 35, 21], [109, 35, 21], [], [], [120, 35, 21], [120, 35, 21], [], [], [109, 35, 21], [109, 35, 21], [], [], [120, 35, 21], [120, 35, 21], [], [], [109, 35, 21], [109, 35, 21], [], [], [120, 35, 21], [120, 35, 21], [], [], [109, 35, 21], [109, 35, 21], [], [], [120, 35, 21], [120, 35, 21], [], [], [109, 35, 21], [109, 35, 21], [], [], [120, 35, 21], [120, 35, 21], [], [], [109, 35, 21], [109, 35, 21], [], [], [120, 35, 21], [120, 35, 21], [], [], [109, 35, 21], [109, 35, 21], [], [], [120, 35, 21], [120, 35, 21], [], [], [109, 35, 21], [109, 35, 21], [], [], [], [], [], [], [], [], [], [], [], [], [109, 35, 21], [], [120, 35, 21], [], [], [], [], [], [], [], [], [], [], [], [120, 35, 21], [120, 35, 21], [120, 35, 21], [120, 35, 21], [120, 35, 21], [120, 35, 21], [120, 35, 21], [120, 35, 21], [120, 35, 21], [], [], [], []]