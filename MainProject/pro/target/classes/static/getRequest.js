 $(document).ready(
		function() {

			// GET REQUEST
			$("#farmerForm").click(function(event) {
				event.preventDefault();
				ajaxGet();
			});

			// DO GET
			function ajaxGet() {
				$.ajax({
					type : "GET",
					url : "saveFarmer",
					success : function(result) {
						if (result.status == "success") {
							$('#getResultDiv ul').empty();
							var custList = "";
							$.each(result.data,
									function(i, farmer) {
										var user = "FarmerName  "
												+ farmer.Name
												+ ", age  = " + farmer.age
												+ "<br>";
										$('#postResultDiv').append(
												user)
									});
							console.log("Success: ", result);
						} else {
							$("#postResultDiv").html("<strong>Error</strong>");
							console.log("Fail: ", result);
						}
					},
					error : function(e) {
						$("#getResultDiv").html("<strong>Error</strong>");
						console.log("ERROR: ", e);
					}
				});
			}
		})