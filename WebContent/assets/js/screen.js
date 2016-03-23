
$(document).ready(function(){
    $("#getCard").on('click', requestCard);
});

var requestCard = function(){
    $.ajax({
        method: "GET",
        url: "http://localhost:8080/Dominion/TestServlet?action=getCard"
    }).done(function(data){
        alert(data);
    });
};