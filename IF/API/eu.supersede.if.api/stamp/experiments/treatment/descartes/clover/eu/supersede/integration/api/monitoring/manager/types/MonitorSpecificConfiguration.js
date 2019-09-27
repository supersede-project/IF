var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":53,"id":4064,"methods":[{"el":25,"sc":2,"sl":23},{"el":28,"sc":2,"sl":26},{"el":31,"sc":2,"sl":29},{"el":34,"sc":2,"sl":32},{"el":37,"sc":2,"sl":35},{"el":40,"sc":2,"sl":38},{"el":43,"sc":2,"sl":41},{"el":46,"sc":2,"sl":44},{"el":49,"sc":2,"sl":47},{"el":52,"sc":2,"sl":50}],"name":"MonitorSpecificConfiguration","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_101":{"methods":[{"sl":23},{"sl":26},{"sl":29},{"sl":32},{"sl":35},{"sl":38},{"sl":41},{"sl":44},{"sl":47},{"sl":50}],"name":"testCreateAndDeleteMonitorConfiguration","pass":true,"statements":[{"sl":24},{"sl":27},{"sl":30},{"sl":33},{"sl":36},{"sl":39},{"sl":42},{"sl":45},{"sl":48},{"sl":51}]},"test_117":{"methods":[{"sl":23},{"sl":26},{"sl":29},{"sl":32},{"sl":35},{"sl":38},{"sl":41},{"sl":44},{"sl":47},{"sl":50}],"name":"testCreateAndDeleteMonitorConfiguration","pass":true,"statements":[{"sl":24},{"sl":27},{"sl":30},{"sl":33},{"sl":36},{"sl":39},{"sl":42},{"sl":45},{"sl":48},{"sl":51}]},"test_121":{"methods":[{"sl":23},{"sl":26},{"sl":29},{"sl":32},{"sl":35},{"sl":38},{"sl":41},{"sl":44},{"sl":47},{"sl":50}],"name":"testUpdateMonitorConfiguration","pass":true,"statements":[{"sl":24},{"sl":27},{"sl":30},{"sl":33},{"sl":36},{"sl":39},{"sl":42},{"sl":45},{"sl":48},{"sl":51}]},"test_127":{"methods":[{"sl":23},{"sl":26},{"sl":35},{"sl":38},{"sl":41},{"sl":44},{"sl":47},{"sl":50}],"name":"testCreateMonitorConfiguration","pass":true,"statements":[{"sl":24},{"sl":27},{"sl":36},{"sl":39},{"sl":42},{"sl":45},{"sl":48},{"sl":51}]},"test_2":{"methods":[{"sl":23},{"sl":26},{"sl":29},{"sl":32},{"sl":35},{"sl":38},{"sl":41},{"sl":44},{"sl":47},{"sl":50}],"name":"testCreateAndDeleteMonitorConfiguration","pass":true,"statements":[{"sl":24},{"sl":27},{"sl":30},{"sl":33},{"sl":36},{"sl":39},{"sl":42},{"sl":45},{"sl":48},{"sl":51}]},"test_39":{"methods":[{"sl":23},{"sl":26},{"sl":29},{"sl":32},{"sl":35},{"sl":38},{"sl":41},{"sl":44},{"sl":47},{"sl":50}],"name":"testCreateAndDeleteMonitorConfigurationMultipart","pass":true,"statements":[{"sl":24},{"sl":27},{"sl":30},{"sl":33},{"sl":36},{"sl":39},{"sl":42},{"sl":45},{"sl":48},{"sl":51}]},"test_81":{"methods":[{"sl":23},{"sl":26},{"sl":29},{"sl":32},{"sl":35},{"sl":38},{"sl":41},{"sl":44},{"sl":47},{"sl":50}],"name":"testUpdateMonitorConfiguration","pass":true,"statements":[{"sl":24},{"sl":27},{"sl":30},{"sl":33},{"sl":36},{"sl":39},{"sl":42},{"sl":45},{"sl":48},{"sl":51}]},"test_88":{"methods":[{"sl":23},{"sl":26},{"sl":29},{"sl":32},{"sl":35},{"sl":38},{"sl":41},{"sl":44},{"sl":47},{"sl":50}],"name":"testCreateUpdateAndDeleteTwitterMonitorConfiguration","pass":true,"statements":[{"sl":24},{"sl":27},{"sl":30},{"sl":33},{"sl":36},{"sl":39},{"sl":42},{"sl":45},{"sl":48},{"sl":51}]},"test_90":{"methods":[{"sl":23},{"sl":26},{"sl":29},{"sl":32},{"sl":35},{"sl":38},{"sl":41},{"sl":44},{"sl":47},{"sl":50}],"name":"testUpdateMonitorConfigurationMultipart","pass":true,"statements":[{"sl":24},{"sl":27},{"sl":30},{"sl":33},{"sl":36},{"sl":39},{"sl":42},{"sl":45},{"sl":48},{"sl":51}]},"test_98":{"methods":[{"sl":23},{"sl":26},{"sl":29},{"sl":32},{"sl":35},{"sl":38},{"sl":41},{"sl":44},{"sl":47},{"sl":50}],"name":"testUpdateMonitorConfiguration","pass":true,"statements":[{"sl":24},{"sl":27},{"sl":30},{"sl":33},{"sl":36},{"sl":39},{"sl":42},{"sl":45},{"sl":48},{"sl":51}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [90, 127, 117, 81, 98, 39, 2, 121, 101, 88], [90, 127, 117, 81, 98, 39, 2, 121, 101, 88], [], [90, 127, 117, 81, 98, 39, 2, 121, 101, 88], [90, 127, 117, 81, 98, 39, 2, 121, 101, 88], [], [90, 117, 81, 98, 39, 2, 121, 101, 88], [90, 117, 81, 98, 39, 2, 121, 101, 88], [], [90, 117, 81, 98, 39, 2, 121, 101, 88], [90, 117, 81, 98, 39, 2, 121, 101, 88], [], [90, 127, 117, 81, 98, 39, 2, 121, 101, 88], [90, 127, 117, 81, 98, 39, 2, 121, 101, 88], [], [90, 127, 117, 81, 98, 39, 2, 121, 101, 88], [90, 127, 117, 81, 98, 39, 2, 121, 101, 88], [], [90, 127, 117, 81, 98, 39, 2, 121, 101, 88], [90, 127, 117, 81, 98, 39, 2, 121, 101, 88], [], [90, 127, 117, 81, 98, 39, 2, 121, 101, 88], [90, 127, 117, 81, 98, 39, 2, 121, 101, 88], [], [90, 127, 117, 81, 98, 39, 2, 121, 101, 88], [90, 127, 117, 81, 98, 39, 2, 121, 101, 88], [], [90, 127, 117, 81, 98, 39, 2, 121, 101, 88], [90, 127, 117, 81, 98, 39, 2, 121, 101, 88], [], []]
