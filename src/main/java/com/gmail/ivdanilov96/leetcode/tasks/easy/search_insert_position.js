var searchInsert = function (nums, target) {
  let start = 0
  let end = nums.length - 1;
  while (start <= end) {
    let curr = Math.floor((end + start) / 2);
    if (nums[curr] === target) {
      return curr;
    }
    if (nums[curr] > target) {
      end = curr - 1;
    } else {
      start = curr + 1;
    }
  }
  return start;
};