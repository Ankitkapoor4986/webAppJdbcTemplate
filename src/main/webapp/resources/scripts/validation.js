var BLANK = "";
var MESSAGE = "Both emailid and password should be filled up";
$("#submit_button").click(
		function(event) {
			if ($("#exampleInputEmail1").val() == BLANK
					|| $("#exampleInputPassword1").val() == BLANK) {
				alert(MESSAGE)
				event.preventDefault();
				event.stopPropagation();
			}

		});