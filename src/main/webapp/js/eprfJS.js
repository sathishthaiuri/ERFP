/*function myFunction(){
	$(document).ready(function () {
		alert("inside javascript");
						$.ajax({
							url:"ajax/listApplns",
							type: "get",
							dataType: "json",
							data:{ method : 'getApplGroups' },
							success: function(data) {
								$('#banner1 .inner').empty();
								var ul_tag = $('<ul>').append('<header>').attr('class','icons major');
								$.each(data, function(index, obj) {
									var li = $('<li>').append($('<a>').attr('id',obj.applid).attr('appln',obj.applname).attr('class','icon fa-check-circle-o fa-7x style3 grow uk-button').attr('data-uk-tooltip','{pos:"top"}').attr('title','Application Name: ' + obj.applname).attr('href','#menu').attr('onclick','getSiteScopes(this)')).append($('<h1>').text(obj.applname));
									ul_tag.append(li);
								});
								$('#banner1 .inner').append(ul_tag);
							}
						});
});}*/
function userListdropDown() {
	alert("inside");
			$.ajax({
			type : "GET",
			url : locationURL + "/RiskPortal/listApplns",
			cache : false,
			success : function(response) {
				$('#divTableRow').html(response);
			},
			error : function(e) {
				alert('Error: ' + e);
			}
		});
}
