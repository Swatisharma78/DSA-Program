function getAvg(grades) {
  const total = grades.reduce((acc, c) => acc + c, 0);
  return total / grades.length;
}
const grades = [80, 77, 88, 95, 68];
const average = getAvg(grades);
console.log(average);
