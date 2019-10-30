let books = null;

$.get("products", function(data) {
	if (data != '') {
		books = data;
	}
}).done(function() {
	let cardsContent = "";
	
	jQuery.each(books, function(i, value) {
		cardsContent+=	"<div class='col '>" +
						"<div class='card'>" +
						"<div class='card-body'>" +
						"<h5 class='card-title'> Book name: "  + value.bookName + "</h5>" + 
						"<h6 class='card-subtitle mb-2 text-muted'> Price: " + value.price + "</h6>" + 
						"<p class='card-text'> Description: " + value.bookDescription + '.00' + "</p>" +
						"<p class='card-text'> ISBN: " + value.isbn + "</p>" + 
						"<p class='card-text'> Quantity: " + value.quantity + "</p>" +
						 "<a href='book?id=" + value.id + "' class='btn btn-primary site-btn'>Open</a>"+
						"</div>" +
						"</div>" +
						"</div>" +
						"</div>"
	});
	
	$("#bookCards").html(cardsContent);
});

