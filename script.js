document.addEventListener("DOMContentLoaded", () => {
  const animeItems = document.querySelectorAll(".anime-item");
  animeItems.forEach((item, i) => {
    setTimeout(() => item.classList.add("show"), i * 100);
  });

  const resetBtn = document.querySelector(".btn.reset");
  resetBtn.addEventListener("click", () => {
    resetBtn.style.transform = "scale(0.9)";
    setTimeout(() => (resetBtn.style.transform = "scale(1)"), 150);
  });

  const addBtn = document.querySelector(".btn.add");
  addBtn.addEventListener("click", () => {
    addBtn.style.transform = "scale(0.95)";
    setTimeout(() => (addBtn.style.transform = "scale(1)"), 150);
  });
});
