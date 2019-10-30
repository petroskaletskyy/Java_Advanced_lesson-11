$("button.addBook").click(function() {

	let name = $("form.addBook input.bookName").val();
	let description = $("form.addBook input.bookDescription").val();
	let isbn = $("form.addBook input.isbn").val();
	let price = $("form.addBook input.price").val();
	let quantity = $("form.addBook input.quantity").val();

	let book = {
		name : name,
		description : description,
		isbn: isbn,
		price : price,
		quantity: quantity
	};

	$.post("book", book, function(data) {
		if (data == 'Success') {
			alert('Success');
		}
	});

});

$("button.buy-product").click(function() {
	var bookId = jQuery(this).attr("product-id");

	$.post("bucket", {'bookId': bookId},
			function(data) {
				if (data == 'Success') {
					$('[data-dismiss=modal]').trigger({type: "click"});
				}
	});
});