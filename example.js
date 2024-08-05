// example.js
function fetchProducts() {
    var xhr = new XMLHttpRequest();
    xhr.open("GET", "products", true);
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {
            document.querySelector('.product-list').innerHTML = xhr.responseText;
        }
    };
    xhr.send();
}
