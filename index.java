document.addEventListener("DOMContentLoaded", () => {
    const cards = document.querySelectorAll(".card");

    cards.forEach(card => {
        const plusButton = card.querySelector(".plus");
        const minusButton = card.querySelector(".minus");
        const deleteButton = card.querySelector(".delete");
        const heartButton = card.querySelector(".heart");
        const priceElement = card.querySelector(".price");
        let price = parseFloat(priceElement.textContent);

        plusButton.addEventListener("click", () => {
            price *= 2;
            priceElement.textContent = price.toFixed(2);
        });

        minusButton.addEventListener("click", () => {
            if (price > 1) {
                price /= 2;
                priceElement.textContent = price.toFixed(2);
            }
        });

        deleteButton.addEventListener("click", () => {
            card.remove();
        });

        heartButton.addEventListener("click", () => {
            heartButton.classList.toggle("liked");
        });
    });
});
