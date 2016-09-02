var arr = [];

$.fn.serializeObject = function()
{
    var o = {};
    var a = this.serializeArray();
    $.each(a, function() {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};

(function () {
    var as = angular.module('angularspring');

       as.controller('ApplicationController', function ($scope, $http, i18n) {
       var self = this;       
             
        $scope.init = function () {                        
              $.ajax({                   
                     url:"listApplicationRecords",
                     type: "get",
                     dataType: "json",
                     data:{ method : 'listApplicationRecords' },
                     success: function(data) {                              
                           /** iterate the application list*/                            
                            $scope.retrieveJsonObj = [];
                            $scope.retrieveJsonVal = [];
                            $scope.retrieveJson = [];
                           console.log(data)
                            /*angular.forEach(data, function (item, key){
                            //  $scope.retrieveJson.push("[{");
                         angular.forEach(item, function(comment, index){
                             //iterate over the likes array:                              
                             angular.forEach(comment, function (like, i){
                             //   $scope.retrieveJson.push(i)
                            //    $scope.retrieveJson.push(":")
                                $scope.retrieveJson.push(like);                              
                             });   
                            // $scope.retrieveJson.push("}, {");
                         });
                       //  $scope.retrieveJson.push("}];");
                     });*/
                            
                            var frameHTML="<table class=\"table-striped\" align=\"center\" style='width:90%'>";
                            var index = 0;
                           angular.forEach(data, function(value, key) {
                        	   	   arr[index] = value;
                        	   	   index = index + 1;
                                   angular.forEach(value, function(value1, key1){
                                         if(key1=="appName"){
                                                 //console.log(value);
                                                 //$scope.retrieveJson.push(value1);
                                        //	 obj = JSON.parse(data);
                                        	// console.log($scope.appId);
                                        	 //var screentwohtml = "{\"erfp\":[' "+value.appId;
                                        	 //var text = '{"erfp":[{"appId":"1","appName":"OSP – Online","appCategory":"Data Supply Chain" }]}';
                                        	// console.log(value1);
                                        	// console.log(text);                                        	                                    	 
                                               	//frameHTML = frameHTML+"<tr><td align=\"left\" style='width:15%'><a href=\"index2.html\"?Id="+value+"><font size=\"2\">"+value1+"</font></a></td>";
                                        	     
                                                 frameHTML = frameHTML+"<tr><td align=\"left\" style='width:15%'> <a href=\"#\" onclick=\"loadRecalcSection('"+index+"');\"><font size=\"2\">"+value1+"</font></a></td>";
                                          }    
                                       
                                          if(key1=="appCategory"){
                                                 
                                                 //$scope.retrieveJson.push(value1);
                                                 frameHTML = frameHTML+"<td align=\"left\" style='width:15%'><font size=\"2\">"+value1+"</font></td>";
                                          }                                 
                                          if(key1=="supportScope"){
                                                 
                                                 //$scope.retrieveJson.push(value1);
                                                 frameHTML = frameHTML+"<td align=\"left\" style='width:10%'><font size=\"2\">"+value1+"</font></td>";
                                          }
                                         
                                          //Application Maintanance Risk Band...
                                          if(key1=="appRiskMaintColor"){
                                                 
                                                 //$scope.retrieveJson.push(value1);                                              
                                                 frameHTML = frameHTML+"<td align=\"left\" style='width:20%'>&nbsp;<img src=\"images/"+value1+".png\">";
                                          }
                                          if(key1=="appRiskMaintCategory"){
                                                 
                                                 //$scope.retrieveJson.push(value1);                                              
                                                 frameHTML = frameHTML+"&nbsp;&nbsp;<font size=\"2\">"+value1+"</font>";
                                          }
                                          if(key1=="appRiskMaintScore"){
                                                 
                                                 //$scope.retrieveJson.push(value1);
                                                 frameHTML = frameHTML+"&nbsp;&nbsp;<font size=\"2\">"+value1+"</font></td>";
                                          }                                         
                                         
                                          
                                          //Infra Risk Band...
                                          if(key1=="appInfraRiskColor"){
                                              
                                              //$scope.retrieveJson.push(value1);                                              
                                              frameHTML = frameHTML+"<td align=\"left\" style='width:15%'><img src=\"images/"+value1+".png\">";
                                          }
                                          if(key1=="appInfraRiskCategory"){
                                              
                                              //$scope.retrieveJson.push(value1);                                              
                                              frameHTML = frameHTML+"&nbsp;<font size=\"2\">"+value1+"</font>";
                                          }
                                          if(key1=="appInfraRiskScore"){
                                              
                                              //$scope.retrieveJson.push(value1);
                                              frameHTML = frameHTML+"&nbsp;<font size=\"2\">"+value1+"</font></td>";
                                          } 
                                         
                                          //Security Risk Band...
                                          if(key1=="appSecurityRiskColor"){
                                                 
                                                 //$scope.retrieveJson.push(value1);                                              
                                                 frameHTML = frameHTML+"<td align=\"left\" style='width:15%'><img src=\"images/"+value1+".png\">";
                                          }
                                          if(key1=="appSecurityRiskCategory"){
                                                 
                                                 //$scope.retrieveJson.push(value1);                                              
                                                 frameHTML = frameHTML+"&nbsp;<font size=\"2\">"+value1+"</font>";
                                          }                                        
                                          if(key1=="appSecurityRiskScore"){
                                                 
                                                 //$scope.retrieveJson.push(value1);
                                                 frameHTML = frameHTML+"&nbsp;<font size=\"2\">"+value1+"</font></td>";
                                          }                                         
                                         
                                          
                                          //People Risk Score...
                                          if(key1=="appPeopleRiskColor"){
                                                 
                                                 //$scope.retrieveJson.push(value1);                                              
                                                 frameHTML = frameHTML+"<td align=\"left\" style='width:15%'><img src=\"images/"+value1+".png\">";
                                          }
                                          if(key1=="appPeopleRiskCategory"){
                                                 
                                                 //$scope.retrieveJson.push(value1);                                              
                                                 frameHTML = frameHTML+"&nbsp;<font size=\"2\">"+value1+"</font>";
                                          }
                                          if(key1=="appPeopleRiskScore"){
                                                 
                                                 //$scope.retrieveJson.push(value1);
                                                 frameHTML = frameHTML+"&nbsp;<font size=\"2\">"+value1+"</font></td></tr>";
                                          }    
                                         
                                                                                   
                                   });
                                   
                                   //$scope.retrieveJson.push('},{');
                            });
                            frameHTML = frameHTML+"</table>";
                            
                     /*      $scope.retrieveJson = data; // get data from json
                                          angular.forEach($scope.retrieveJson, function(item){                                                  
                                                             $scope.retrieveJsonVal.push(item);                                                                   
                                           })*/
                           // $scope.retrieveJsonVal.push(data); 
                           
                           // console.log(ul_tag);
                                   
                            //console.log("After JSON Parsing:"+JSON.stringify($scope.retrieveJson));
                           
                                                       
                            document.getElementById('inner').innerHTML=frameHTML;
                           
                     }
              });           
        }; 
        
              

    });
       
       
       
     
}());

var screentwohtml ="";

/**
 * function to show the home page
 */
function backToHome(){
	$('#screen2').hide();
	$('#riskScoreform').hide();
	$('#screen1').show();	
}


function reCalculateRiskScore() {
    console.log("reCalculateRiskScore");
	//$("#scoresection").hide();	
	// console.log(JSON.stringify($('#riskScoreform').serializeObject()));
	// var jsonText=JSON.stringify($('#riskScoreform').serializeObject());
	 
	var jsonText ='{ "appId": 1,"appName": "OSP – Online"}';
	console.log(jsonText);

	 
    //var encoded = $.toJSON($('#formid1'));
	 /* $('#riskScoreform').submit(function() {
		     console.log(JSON.stringify($('#riskScoreform').serializeObject()));
		    return false;
		  });	*/
	$.ajax({                   
        url:"scoreRecalculation",
        type: "get",       
        contentType: "application/json; charset=UTF-8",
       // data:'jsonData='+JSON.stringify($('#riskScoreform').serializeObject()),
        
        data:'jsonData='+jsonText,
        success: function(data) {
              console.log("Success")
        }
 });       
}

function loadRecalcSection(value){	
	console.log("value:"+arr[value - 1]);
	//screentwohtml ='<form id="riskScoreform"><div class="center_content"><div class="divTable1"><table style="height: 110px; margin-right: auto; margin-left: 12px; margin-top: 1%; font-size: 13; font-weight: bold;" width="400"><tbody><tr style="height: 15px;"><td>Application ID :</td><td><label><b>'+arr[value - 1].appId+'</b></p></td></tr><tr style="height: 15px;"><td>Application Name :</td><td><label><b>'+arr[value - 1].appName+'</b></label></td></tr><tr style="height: 15px;"><td>Application Category :</td><td style="font-weight: bold;"><label><b>'+arr[value - 1].appCategory+'</b></label></td></tr><tr style="height: 15px;"><td>Support Scope:</td><td style="font-weight: bold;"><label><b>'+arr[value - 1].supportScope+'</b></label></td></tr></tbody></table><img style="margin-left: 37%;" width: 100px; height: 15px; top: 15px; left: 980px;" src="images/calcButton.png" alt="Re-Calculate" onclick="reCalculateRiskScore();" /><div class="divTableBody"><div class="divTableRow1"><div class="divTableCell"><table style="width: 650px; height: 210px;"><tr><td style="width: 470px;"><table cellspacing="2" style="height: 210px; margin-left: 5%; background-color: #BCDEE8; font-size: 12; font-weight: bold;" width="600px"><tbody><tr style="height: 15px;"><td align="center" colspan="2" style="margin-left: 4%;">Application Stability Index</td></tr><tr style="height: 15px;"><td align="left">&nbsp;Application Age</td><td><input name="ageInYears" id="ageInYears" value="'+arr[value - 1].ageInYears+'" /></td></tr><tr style=height:15px;"><td align="left">&nbsp;Number of Releases/UBR</td><td  align="right"><input name="noReleaseUbr" id="noReleaseUbr" value='+arr[value - 1].noReleaseUbr+'/></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Number of Tickets Volume</td><td align="right"><select name="noTktsVlm" id="noTktsVlm"><option selected="selected">'+arr[value - 1].noTktsVlm+'</option><option>Low < 50K Txns</option><option>Medium > 50K Txns to 1 Mn Txns</option><option>High >1M Txns</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Number of Sev1\Sev2</td><td align="right"><input name="noSev1Sev2" id="noSev1Sev2" value='+arr[value - 1].noSev1Sev2+' /></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Number of Incident Tickets</td><td align="right"><input name="noIncTkt" id="noIncTkt" value='+arr[value - 1].noIncTkt+' /></td></tr><tr style="height: 15px;"><td align="left">&nbsp;No. Of SRT"s\Issue Bridges directly attributed to Application</td><td align="right"><input name="noSrtCount" id="noSrtCount" value='+arr[value - 1].noSrtCount+' /></td></tr><tr style="height: 15px;"><td align="left">&nbsp;No. of Tickets resolved with Vendor support (3rd Party like Axway etc)</td><td align="right"><select name="noTktRslvVendor" id="noTktRslvVendor"><option selected="selected">'+arr[value - 1].noTktRslvVendor+'</option><option>Yes</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Manual Intervention/Production Support in Effort/Day</td><td align="right"><select name="manualIntervension" id="manualIntervension"><option selected="selected">'+arr[value - 1].manualIntervension+'</option><option>Low < 2 Hours/Day</option><option>Medium <4 Hours/Day</option><option>High >4 Hours/Day</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Number ofOut of Office Hour callouts (2015)</td><td align="right"><input name="noOutofoffCallouts" id="noOutofoffCallouts" value='+arr[value - 1].noOutofoffCallouts+' /></td></tr></tbody></table></td></tr></table></br><table style="width: 650px; height: 100px;"><tbody><tr><td style="width: 470px;"><table style="height: 100px; margin-left: 5%; background-color: #BCDEE8; font-size: 12; font-weight: bold;" width="600px"><tbody><tr style="height: 15px;"><td align="center" colspan="2">&nbsp;Application Complexity Index</td></tr><tr style="height: 15px;"><td align="left">&nbsp;Number of Interfacing applications</td><td align="right"><input name="noInterfacApp" id="noInterfacApp" value='+arr[value - 1].noInterfacApp+' /></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Data Volume /Transaction per day</td><td align="right"><input name="dataVolumeDay" id="dataVolumeDay" value='+arr[value - 1].dataVolumeDay+' /></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Technology and Support Availability</td><td align="right"><select name="techSuprtAvlbt" id="techSuprtAvlbt"><option selected="selected">'+arr[value - 1].techSuprtAvlbt+'</option><option>Niche & Support Unavailable</option><option>Web & Support Unavailable</option><option>Legacy & Support Available</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Number of Sev1\Sev2</td><td align="right"><input name="noSev1Sev2" id="noSev1Sev2" value='+arr[value - 1].noSev1Sev2+' /></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Code Availability</td><td align="right"><select name="codeAvlbt" id="codeAvlbt"><option selected="selected">'+arr[value - 1].codeAvlbt+'</option><option>Partial</option><option>Yes</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;% Increase in data volume/Year</td><td align="right"><select name="increaDataVlmYr" id="increaDataVlmYr"><option selected="selected">'+arr[value - 1].increaDataVlmYr+'</option><option>Low < 3%</option><option>Medium 3% to 8%</option><option>High > 8%</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Regulatory Compliance</td><td align="right"><select name="regCompliance" id="regCompliance"><option selected="selected">'+arr[value - 1].regCompliance+'</option><option>Yes</option><option>No</option></select></td></tr></tbody></table></td></tr></tbody></table></br><table style="width: 650px; height: 100px;"><tbody><tr><td style="width: 470px;"><table style="height: 100px; margin-left: 5%; background-color: #BCDEE8; font-size: 12; font-weight: bold;" width="600"><tbody><tr style="height: 15px;"><td align="center" colspan="2">&nbsp;Impact and Recovery Index</td></tr><tr style="height: 15px;"><td align="left">&nbsp;Revenue Impact</td><td align="right"><select name="revImpact" id="revImpact"><option selected="selected">'+arr[value - 1].revImpact+'</option><option>Direct & Immediate Revenue Impact</option><option>Indirect Revenue Impact</option><option>No Revenue Impact</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Impact to Customer</td><td align="right"><select name="impatcToCustomer" id="impatcToCustomer"><option selected="selected">'+arr[value - 1].impatcToCustomer+'</option><option>High > 50 Users</option><option>Medium - 10 to 50 users</option><option>Low < 10 users</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Recovery Duration (App./SW/Infra.)</td><td align="right"><select name="recoveryDuration" id="recoveryDuration"><option selected="selected">'+arr[value - 1].recoveryDuration+'</option><option>4 to 12 Hours</option><option>12 Hours to 1 Day</option><option>> 1 Day</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Impact to Upstream / Downstream Apps</td><td align="right"><select name="impactUpDnStream" id="impactUpDnStream"><option selected="selected">'+arr[value - 1].impactUpDnStream+'</option><option>> 5 systems</option><option>< 5 systems</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Impact to Brand Image</td><td align="right"><select name="impactBrandImg" id="impactBrandImg"><option selected="selected">'+arr[value - 1].impactBrandImg+'</option><option>Yes</option><option>No</option></select></td></tr></tbody></table></td></tr></tbody></table></br><table style="width: 650px; height: 100px;"><tbody><tr><td style="width: 470px;"><table style="height: 100px; margin-left: 5%; background-color: #BCDEE8; font-size: 12; font-weight: bold;" width="600"><tbody><tr style="height: 15px;"><td align="center" colspan="2">Infra. Risk</td></tr><tr style="height: 15px;"><td align="left">&nbsp;Application Performance SLA</td><td align="right"><select name="appPerfSla" id="appPerfSla"><option selected="selected">'+arr[value - 1].appPerfSla+'</option><option>Above defined SLA</option><option>Below SLA</option><option>Met SLA</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Scalability/Capacity Related Issues</td><td align="right"><select name="scalability" id="scalability"><option selected="selected">'+arr[value - 1].scalability+'</option><option>Yes</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Obsolete Infrastructure</td><td align="right"><select name="obsoleteInfra" id="obsoleteInfra"><option selected="selected">'+arr[value - 1].obsoleteInfra+'</option><option>Yes</option><option>No</option><option>Partial</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;DR Environment Availability</td><td align="right"><select name="drEnvAvlbt" id="drEnvAvlbt"><option selected="selected">'+arr[value - 1].drEnvAvlbt+'</option><option>Yes</option><option>No</option><option>Partial</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Network / Infrastructure issues per month</td><td align="right"><select name="nwInfraIssuePm" id="nwInfraIssuePm"><option selected="selected">'+arr[value - 1].nwInfraIssuePm+'</option><option>> 5</option><option>> 2 and < 5</option><option>< 2</option></select></td></tr></tbody></table></td></tr></tbody></table></br><table style="width: 650px; height: 100px;"><tbody><tr><td style="width: 470px;"><table style="height: 100px; margin-left: 5%; background-color: #BCDEE8; font-size: 12; font-weight: bold;" width="600"><tbody><tr style="height: 15px;"><td align="center" colspan="2">Security. Risk</td></tr><tr style="height: 15px;"><td align="left">&nbsp;Security Vulnerability (Code)</td><td align="right"><select name="secVlnbtyCode" id="secVlnbtyCode"><option selected="selected">'+arr[value - 1].secVlnbtyCode+'</option><option>Yes - High Priority issues</option><option>Yes - Medium/Low Priority issues</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Security Vulnerability (Infra)</td><td align="right"><select name="secVlnbtyInfra" id="secVlnbtyInfra"><option selected="selected">'+arr[value - 1].secVlnbtyInfra+'</option><option>Yes - High Priority issues</option><option>Yes - Medium/Low Priority issues</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Compliance Related Vulnerabilities</td><td align="right"><select name="compVlnblts" id="compVlnblts"><option selected="selected">'+arr[value - 1].compVlnblts+'</option><option>Yes - High Priority issues</option><option>Yes - Medium/Low Priority issues</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Conf. Mgmt Availability</td><td align="right"><select name="confMgtVlnbty" id="confMgtVlnbty"><option selected="selected">'+arr[value - 1].confMgtVlnbty+'</option><option>Yes</option><option>No</option><option>Partial</option></select></td></tr></tbody></table></td></tr></tbody></table></br><img style="margin-left: 70%;" width: 100px; height: 35px; top: 15px; left: 980px;" src="images/calcButton.png" alt="Re-Calculate" reCalculateRiskScore();/></div><div class="divTableCell3"><br><br><br><br><table style="margin-left: 20px; margin-top: 100px; height: 27px;" width="100%"><tbody></tbody></table></div><div class="divTableCell"><table style="width: 650px; height: 100px;"><td style="width: 470px;"><table cellspacing="2" style="height: 100px; margin-left: 5%; background-color:; font-size: 12; font-weight: bold;" width="600px"><tbody><tr><td align="center"></td></tr><tr style="height: 24px;"><td align="center" colspan="3" rowspan="3"><div><img src="images/app_'+arr[value - 1].appRiskMaintColor+'_'+arr[value - 1].appRiskMaintCategory+'.png" /><label for="appName" class="imtip">'+arr[value - 1].appPeopleRiskScore+'</label></div></td></tr></tbody></table></td></tr></table></br><table style="width: 650px; height: 100px;"><tr><td style="width: 470px;"><table cellspacing="2" style="height: 100px; margin-left: 5%; background-color:; font-size: 12; font-weight: bold;" width="600px"><tbody><tr><td align="center"></td></tr><tr style="height: 24px;"><td align="center" colspan="3" rowspan="3"><div><img src="images/infra_'+arr[value - 1].appInfraRiskColor+'_'+arr[value - 1].appInfraRiskCategory+'.png" /><label for="appName" class="imtip">'+arr[value - 1].appInfraRiskScore+'</label></div></td></tr></tbody></table></td></tr></table></br><table style="width: 650px; height: 100px;"><tr><td style="width: 470px;"><table cellspacing="2" style="height: 100px; margin-left: 5%; background-color:; font-size: 12; font-weight: bold;" width="600px"><tbody><tr><td align="center"></td></tr><tr style="height: 24px;"><td align="center" colspan="3" rowspan="3"><div><img src="images/security_'+arr[value - 1].appSecurityRiskColor+'_'+arr[value - 1].appSecurityRiskCategory+'.png" /><label for="appName" class="imtip">'+arr[value - 1].appSecurityRiskScore+'</label></div></td></tr></tbody></table></td></tr></table></br><table style="width: 650px; height: 100px;"><tr><td style="width: 470px;"><table cellspacing="2" style="height: 100px; margin-left: 5%; background-color:; font-size: 12; font-weight: bold;" width="600px"><tbody><tr><td align="center"></td></tr><tr style="height: 24px;"><td align="center" colspan="3" rowspan="3"><div><img src="images/people_'+arr[value - 1].appPeopleRiskColor+'_'+arr[value - 1].appPeopleRiskCategory+'.png" /><label for="appName" class="imtip">'+arr[value - 1].appPeopleRiskScore+'</label></div></td></tr></tbody></table></td></tr></table></br></div></div></div></div></div></form>';
	screentwohtml='<form id="riskScoreform"><div class="center_content"><div class="divTable1"><table style="height: 110px; margin-right: auto; margin-left: 12px; margin-top: 1%; font-size: 13; font-weight: bold;" width="400"><tbody><tr style="height: 15px;"><td>Application ID :</td><td><label><b>'+arr[value - 1].appId+'</b></p></td></tr><tr style="height: 15px;"><td>Application Name :</td><td><label><b>'+arr[value - 1].appName+'</b></label></td></tr><tr style="height: 15px;"><td>Application Category :</td><td style="font-weight: bold;"><label><b>'+arr[value - 1].appCategory+'</b></label></td></tr><tr style="height: 15px;"><td>Support Scope:</td><td style="font-weight: bold;"><label><b>'+arr[value - 1].supportScope+'</b></label></td></tr></tbody></table><img style="margin-left: 37%;" width: 100px; height: 15px; top: 15px; left: 980px;" src="images/calcButton.png" alt="Re-Calculate" onclick="reCalculateRiskScore();" /><div class="divTableBody"><div class="divTableRow1"><div class="divTableCell"><table style="width: 650px; height: 210px;"><tr><td style="width: 470px;"><table cellspacing="2" style="height: 210px; margin-left: 5%; background-color: #BCDEE8; font-size: 12; font-weight: bold;" width="600px"><tbody><tr style="height: 15px;"><td align="center" colspan="2" style="margin-left: 4%;">Application Stability Index</td></tr><tr style="height: 15px;"><td align="left">&nbsp;Application Age</td><td align="right"><select><option selected="selected">'+arr[value - 1].ageInYears+'</option><option>> 2 years</option><option>> 5 years</option><option>> 10 years</option><option>> 15 years</option><option>> 25 years</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Number of Releases/UBR</td><td align="right"><input name="noReleaseUbr" id="noReleaseUbr" type="number" value='+arr[value - 1].noReleaseUbr+' /></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Number of Tickets Volume</td><td align="right"><input name="noTktsVlm" type="number" id="noTktsVlm" value='+arr[value - 1].noTktsVlm+' /></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Number of Sev1\Sev2</td><td align="right"><input name="noSev1Sev2" type="number" id="noSev1Sev2" value='+arr[value - 1].noSev1Sev2+' /></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Number of Incident Tickets</td><td align="right"><input name="noIncTkt" id="noIncTkt" type="number" value='+arr[value - 1].noIncTkt+' /></td></tr><tr style="height: 15px;"><td align="left">&nbsp;No. Of SRT"s\Issue Bridges directly attributed to Application</td><td align="right"><input name="noSrtCount" type="number" id="noSrtCount" value='+arr[value - 1].noSrtCount+' /></td></tr><tr style="height: 15px;"><td align="left">&nbsp;No. of Tickets resolved with Vendor support (3rd Party like<br>Axway etc) </td><td align="right"><select name="noTktRslvVendor" id="noTktRslvVendor"><option selected="selected">'+arr[value - 1].noTktRslvVendor+'</option><option>High > 5 Tickets/Year</option><option>Medium < 5 Tickets/Year</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Manual Intervention/Production Support in Effort/Day</td><td align="right"><select name="manualIntervension" id="manualIntervension"><option selected="selected">'+arr[value - 1].manualIntervension+'</option><option>Low < 2 Hours/Day</option><option>Medium <4 Hours/Day</option><option>High >4 Hours/Day</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Number ofOut of Office Hour callouts (2015)</td><td align="right"><input name="noOutofoffCallouts" type="number" id="noOutofoffCallouts" value='+arr[value - 1].noOutofoffCallouts+' /></td></tr></tbody></table></td></tr></table></br><table style="width: 650px; height: 100px;"><tbody><tr><td style="width: 470px;"><table style= "height: 100px; margin-left: 5%; background-color: #BCDEE8; font-size:12;font-weight: bold;" width="600px"><tbody><tr style="height: 15px;"><td align="center"colspan="2">&nbsp;Application Complexity Index</td></tr><tr style="height: 15px;"><td align="left">&nbsp;Number of Interfacing applications</td><td align="right"><input name="noInterfacApp" id="noInterfacApp" type="number" value='+arr[value - 1].noInterfacApp+' /></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Data Volume /Transaction per day</td><td align="right"><select name="dataVolumeDay" id="dataVolumeDay"><option selected="selected">'+arr[value - 1].noTktsVlm+'</option><option>Low < 50K Txns</option><option>Medium > 50K Txns to 1 Mn Txns</option><option>High >1M Txns</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Technology and Support Availability</td><td align="right"><select name="techSuprtAvlbt" id="techSuprtAvlbt"><option selected="selected">'+arr[value - 1].techSuprtAvlbt+'</option><option>Niche & Support Unavailable</option><option>Web & Support Unavailable</option><option>Legacy & Support Available</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Code Availability</td><td align="right"><select name="codeAvlbt" id="codeAvlbt"><option selected="selected">'+arr[value - 1].codeAvlbt+'</option><option>Partial</option><option>Yes</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;% Increase in data volume/Year</td><td align="right"><select  name="increaDataVlmYr" id="increaDataVlmYr"><option selected="selected">'+arr[value - 1].increaDataVlmYr+'</option><option>Low < 3%</option><option>Medium 3% to 8%</option><option>High > 8%</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Regulatory Compliance</td><td align="right"><select name="regCompliance" id="regCompliance"><option selected="selected">'+arr[value - 1].regCompliance+'</option><option>Yes</option><option>No</option></select></td></tr></tbody></table></td></tr></tbody></table></br><table style="width: 650px; height: 100px;"><tbody><tr><td style="width: 470px;"><table style= "height: 100px; margin-left: 5%; background-color: #BCDEE8; font-size:12;font-weight: bold;" width="600"><tbody><tr style="height: 15px;"><td align="center"colspan="2">&nbsp;Impact and Recovery Index</td></tr><tr style="height: 15px;"><td align="left">&nbsp;Revenue Impact</td><td align="right"><select name="revImpact" id="revImpact"><option selected="selected">'+arr[value - 1].revImpact+'</option><option>Direct & Immediate Revenue Impact</option><option>Indirect Revenue Impact</option><option>No Revenue Impact</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Impact to Customer</td><td align="right"><select name="impatcToCustomer" id="impatcToCustomer"><option selected="selected">'+arr[value - 1].impatcToCustomer+'</option><option>High > 50 Users</option><option>Medium - 10 to 50 users</option><option>Low < 10 users</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Recovery Duration (App./SW/Infra.)</td><td align="right"><select name="recoveryDuration" id="recoveryDuration"><option selected="selected">'+arr[value - 1].recoveryDuration+'</option><option>4 to 12 Hours</option><option>12 Hours to 1 Day</option><option>> 1 Day</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Impact to Upstream / Downstream Apps</td><td align="right"><select name="impactUpDnStream" id="impactUpDnStream"><option selected="selected">'+arr[value - 1].impactUpDnStream+'</option><option>> 5 systems</option><option>< 5 systems</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Impact to Brand Image</td><td align="right"><select name="impactBrandImg" id="impactBrandImg"><option selected="selected">'+arr[value - 1].impactBrandImg+'</option><option>Yes</option><option>No</option></select></td></tr></tbody></table></td></tr></tbody></table></br><table style="width: 650px; height: 100px;"><tbody><tr><td style="width: 470px;"><table style= "height: 100px; margin-left: 5%;  background-color: #BCDEE8; font-size:12;font-weight: bold;" width="600"><tbody><tr style="height: 15px;"><td align="center"colspan="2">Infra. Risk</td></tr><tr style="height: 15px;"><td align="left">&nbsp;Application Performance SLA</td><td align="right"><select name="appPerfSla" id="appPerfSla"><option selected="selected">'+arr[value - 1].appPerfSla+'</option><option>Above defined SLA</option><option>Below SLA</option><option>Met SLA</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Scalability/Capacity Related Issues</td><td align="right"><select  name="scalability" id="scalability"><option selected="selected">'+arr[value - 1].scalability+'</option><option>Yes</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Obsolete Infrastructure</td><td align="right"><select name="obsoleteInfra" id="obsoleteInfra"><option selected="selected">'+arr[value - 1].obsoleteInfra+'</option><option>Yes</option><option>No</option><option>Partial</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;DR Environment Availability</td><td align="right"><select name="drEnvAvlbt" id="drEnvAvlbt"><option selected="selected">'+arr[value - 1].drEnvAvlbt+'</option><option>Yes</option><option>No</option><option>Partial</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Network / Infrastructure issues per month</td><td align="right"><select name="nwInfraIssuePm" id="nwInfraIssuePm"><option selected="selected">'+arr[value - 1].nwInfraIssuePm+'</option><option>> 5</option><option>> 2 and < 5</option><option>< 2</option></select></td></tr></tbody></table></td></tr></tbody></table></br><table style="width: 650px; height: 100px;"><tbody><tr><td style="width: 470px;"><table style= "height: 100px; margin-left: 5%;background-color: #BCDEE8; font-size:12;font-weight: bold;" width="600"><tbody><tr style="height: 15px;"><td align="center"colspan="2">Security. Risk</td></tr><tr style="height: 15px;"><td align="left">&nbsp;Security Vulnerability (Code)</td><td align="right"><select  name="secVlnbtyCode" id="secVlnbtyCode"><option selected="selected">'+arr[value - 1].secVlnbtyCode+'</option><option>Yes - High Priority issues</option><option>Yes - Medium/Low Priority issues</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Security Vulnerability (Infra)</td><td align="right"><select name="secVlnbtyInfra" id="secVlnbtyInfra"><option selected="selected">'+arr[value - 1].secVlnbtyInfra+'</option><option>Yes - High Priority issues</option><option>Yes - Medium/Low Priority issues</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Compliance Related Vulnerabilities</td><td align="right"><select name="compVlnblts" id="compVlnblts"><option selected="selected">'+arr[value - 1].compVlnblts+'</option><option>Yes - High Priority issues</option><option>Yes - Medium/Low Priority issues</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Conf. Mgmt Availability</td><td align="right"><select name="confMgtVlnbty" id="confMgtVlnbty"><option selected="selected">'+arr[value - 1].confMgtVlnbty+'</option><option>Yes</option><option>No</option><option>Partial</option></select></td></tr></tbody></table></td></tr></tbody></table></br><table style="width: 650px; height: 100px;"><tbody><tr><td style="width: 470px;"><table style= "height: 100px; margin-left: 5%;background-color: #BCDEE8; font-size:12;font-weight: bold;" width="600"><tbody><tr style="height: 15px;"><td align="center"colspan="2">People. Risk</td></tr><tr style="height: 15px;"><td align="left">&nbsp;SME Availability</td><td align="right"><select><option selected="selected">'+arr[value - 1].smeAvlbt+'</option><option>Yes - 1 SME</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Vendor Expertise(Cognizant Availability)</td><td align="right"><select><option selected="selected">'+arr[value - 1].vendorExptCts+'</option><option>Yes</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Vendor Expertise(Ensono Availability)</td><td align="right"><select><option selected="selected">'+arr[value - 1].vendorExptEnsono+'</option><option>Yes</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Availability Business Users</td><td align="right"><select><option selected="selected">'+arr[value - 1].avlbtBizUsers+'</option><option>Yes</option><option>No</option></select></td></tr></tbody></table></td></tr></tbody></table></br><img style="margin-left:70%; style= "width: 100px; height: 35px; top: 15px; left: 980px;" src="images/calcButton.png" alt="Re-Calculate" reCalculateRiskScore();/></div><div class="divTableCell3"><br><br><br><br><table style= "margin-left: 20px;margin-top:100px; height: 27px;" width="100%"><tbody></tbody></table></div><div class="divTableCell"><table style="width: 650px; height: 100px;"><td style="width: 470px;"><table style= "height: 100px; margin-left: 5%;background-color: ; font-size:12;font-weight: bold;" width="600px"><tbody><tr style="height: 24px;"><td align="center"colspan="3" rowspan="3"><div><img src="images/app_'+arr[value - 1].appRiskMaintColor+'_'+arr[value - 1].appRiskMaintCategory+'.png"/><label for="appName" class="imtip">'+arr[value - 1].appPeopleRiskScore+'</label></div></td></tr></tbody></table></td></tr></table></br><table style="width: 650px; height: 100px;"><tr><td style="width: 470px;"><table cellspacing="2" style= "height: 100px; margin-left: 5%;background-color: ; font-size:12;font-weight: bold;" width="600px"><tbody><tr><td align="center"></td></tr><tr style="height: 24px;"><td align="center"colspan="3" rowspan="3"><div><img src="images/infra_'+arr[value - 1].appInfraRiskColor+'_'+arr[value - 1].appInfraRiskCategory+'.png"/><label for="appName" class="imtip">'+arr[value - 1].appInfraRiskScore+'</label></div></td></tr></tbody></table></td></tr></table></br><table style="width: 650px; height: 100px;"><tr><td style="width: 470px;"><table cellspacing="2" style= "height: 100px; margin-left: 5%;background-color:; font-size:12;font-weight: bold;" width="600px"><tbody><tr><td align="center"></td></tr><tr style="height: 24px;"><td align="center"colspan="3" rowspan="3"><div><img src= "images/security_'+arr[value - 1].appSecurityRiskColor+'_'+arr[value - 1].appSecurityRiskCategory+'.png"/><label for="appName" class="imtip">'+arr[value - 1].appSecurityRiskScore+'</label></div></td></tr></tbody></table></td></tr></table></br><table style="width: 650px; height: 100px;"><tr><td style="width: 470px;"><table cellspacing="2" style= "height: 100px; margin-left: 5%;background-color:; font-size:12;font-weight: bold;" width="600px"><tbody><tr><td align="center"></td></tr><tr style="height: 24px;"><td align="center" colspan= "3" rowspan="3"><div><img src= "images/people_'+arr[value - 1].appPeopleRiskColor+'_'+arr[value - 1].appPeopleRiskCategory+'.png"/><label for="appName" class="imtip">'+arr[value - 1].appPeopleRiskScore+'</label></div></td></tr></tbody></table></td></tr></table></br></div></div></div></div></div></form>';
	$("#screen1").hide();
	$("#screen2").show();
	$("#screen2").append(screentwohtml);
}



