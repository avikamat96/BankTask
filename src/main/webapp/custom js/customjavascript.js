function dataFiller(input) {
	$(document)
			.ready(
					function() {
						var url = "http://localhost:8080/ServletJQueryInteraction/InteractionServlet"
						$.get(url, {
							"button-id" : input
						}, function(responseText) {
							$("#data").text(responseText);
						});
					});
}
// JQuery code for changing active status based on the link clicked.
$("document").ready(function() {
	$(".navbar-nav a").click(function() {
		$(".navbar-nav").find("li.active").removeClass("active");
		$(this).parent("li").addClass("active");
	});
});

