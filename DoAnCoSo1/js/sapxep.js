const sortAscendingButton = document.querySelector('#sort-ascending');
sortAscendingButton.addEventListener('click', () => {
  sortProducts('ascending');
});

const sortDescendingButton = document.querySelector('#sort-descending');
sortDescendingButton.addEventListener('click', () => {
  sortProducts('descending');
});

function sortProducts(order) {
  const products = document.querySelectorAll('.col-lg-3');

  const productsArray = Array.from(products);

  productsArray.sort((a, b) => {
    // Lấy giá trị giá từ phần tử HTML
    const priceA = parseInt(a.querySelector('.priceNew').textContent.replace(/\./g, ''));
    const priceB = parseInt(b.querySelector('.priceNew').textContent.replace(/\./g, ''));

    // So sánh giá trị giá
    if (order === 'ascending') {
      return priceA - priceB;
    } else {
      return priceB - priceA;
    }
  });

  // Cập nhật lại vị trí của các sản phẩm sau khi sắp xếp
  const container = document.querySelector('.sellSector');
  productsArray.forEach((product, index) => {
    if (index % 4 === 0) {
      row = document.createElement('div');
      row.classList.add('row');
      container.appendChild(row);
    }
    product.classList.add('col');
    row.appendChild(product);
  });
}
