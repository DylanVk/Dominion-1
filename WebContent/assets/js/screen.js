
$(document).ready(function(){
    initActionCards();
});

var requestCard = function(){
    $.ajax({
        method: "GET",
        url: "http://localhost:8080/Dominion/TestServlet?action=getCard"
    }).done(function(data){
        alert(data);
    });
};

var initActionCards = function() {
	var img = "<img src='images/masterpiece.jpg'>";
	for (var i = 0; i < 5; i++) {
		$("#topAction").append("<div>" + img + "</div>");
		$("#bottomAction").append("<div>" + img + "</div>");
	}
}