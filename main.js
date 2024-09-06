import main from "./target/main/main.js";


function sample() {
  console.log("sample");
}

const debouncedSample = main.debounce(sample, 1000);
