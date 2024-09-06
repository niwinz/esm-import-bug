# ESM build bug with ESM import

## How to Run

Install dependencies:

```bash
npm install
# or
yarn
```

Compile the module:

```bash
yarn run compile
```

Then try to run the test code:

```bash
node main.js
```

It will output something like this:

```
nstalling CLJS DevTools 1.0.7 and enabling features :formatters :hints :async
file:///home/penpot/penpot/playground/esm-import-bug/target/main/cljs-runtime/playground.external.js:6
return shadow.esm.esm_import$lodash$debounce(f,timeout,options);
                  ^

TypeError: shadow.esm.esm_import$lodash$debounce is not a function
    at Object.playground$external$debounce [as debounce] (file:///home/penpot/penpot/playground/esm-import-bug/target/main/cljs-runtime/playground.external.js:6:19)
    at file:///home/penpot/penpot/playground/esm-import-bug/main.js:8:30
    at ModuleJob.run (node:internal/modules/esm/module_job:218:25)
    at async ModuleLoader.import (node:internal/modules/esm/loader:329:24)
    at async loadESM (node:internal/process/esm_loader:28:7)
    at async handleMainPromise (node:internal/modules/run_main:113:12)

Node.js v20.11.1
```

