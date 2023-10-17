let title = document.querySelector('.title');
let curs = document.querySelector('.cursor');

document.addEventListener('mousemove', (e) => {
  let x = e.pageX;
  let y = e.pageY;
  curs.style.left = (x - 22) + "px";
  curs.style.top = (y - 22) + "px";
})