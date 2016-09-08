var arr = [];
var isModel=false;
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
       window.mscope=$scope;
          $scope.applRecordList;   
          $scope.sortType="appId";
          $scope.sortBack = false;
          $scope.isModel = true;     
          $scope.searchType;     
         $scope.init=function(){
           $http({
                method: "GET",
                url: "listApplicationRecords",
                data: {
                    "method" : 'listApplicationRecords'
                },
                headers: {
                    'Content-Type': 'application/json'
                }
            }).then(function successCallback(response) {
                   $scope.appRecordList = response.data;
                   $scope.isModel = isModel = false;
                },
                function errorCallback(response) {
                   alert("Please check the backend/network connectivity");
                });
         }
       $scope.loadAppDetails=function(appName){    	   
       	$scope.row;
       		for(var i = 0; i<= $scope.appRecordList.length;i++){
       			$scope.row=$scope.appRecordList[i];       			
       				if($scope.row.appName == appName){
       					arr = $scope.row;
       					loadRecalcSection(arr);
       					break;
       				}       			
       		}
       } 
       $scope.searchfield = function(){
    	   return $scope.searchField;
       }
       $scope.showSearchFields = function(){
    	   $scope.showSearch =  !$scope.showSearch;
    	   if($scope.showSearch == false){
    		   $scope.seachAppName=null;
    	   }
       }
    });       
})();
var screentwohtml ="";

/**
 * function to show the home page
 */
function backToHome(){
	$('#screen2Left').hide();
	$('#screen2Right').hide();
	$('#screen1').show();	
}


function reCalculateRiskScore() {	
	$("#modelWindow").css("display","block");
	 var jsonText=JSON.stringify($('#riskScoreform').serializeObject());
	$.ajax({                   
        url:"scoreRecalculation",
        type: "POST",       
        contentType: "application/json; charset=UTF-8",              
        data: jsonText,
        dataType: "json",
        success: function(data) {
            console.log("Success");
            
        	$('#screen2Right').empty();
        	$('#screen2Right').show();            
            //console.log("Data: "+data.appId);
            //console.log("Data: "+data.appName);
            //console.log( data.appRiskMaintColor+'_'+data.appRiskMaintCategory);
            
			var recalSectionDIV = '<div id="riskScoreImageDiv"><div class="divTableCell"></br></br></br></br></br></br></br></br></br></br><table style="width: 65px; height: 100px;margin-top:20%;"><tr><td style="width: 47px;"><table style="height: 100px; margin-left: 5%; background-color:; font-size: 12; font-weight: bold;" width="600px"><tbody><tr style="height: 24px;"><td align="center" colspan="3" rowspan="3"><div><img src="images/app_'
							+ data.appRiskMaintColor
							+ '_'
							+ data.appRiskMaintCategory
							+ '.png" /><label for="appName" class="imtip">'
							+ data.appRiskMaintScore
							+ '</label></div></td></tr></tbody></table></td></tr></table></br></br></br></br></br><table style="width: 650px; height: 100px;"><tr><td style="width: 470px;"><table cellspacing="2" style="height: 100px; margin-left: 5%; background-color:; font-size: 12; font-weight: bold;" width="600px"><tbody><tr><td align="center"></td></tr><tr style="height: 24px;"><td align="center" colspan="3" rowspan="3"><div><img src="images/infra_'
							+ data.appInfraRiskColor
							+ '_'
							+ data.appInfraRiskCategory
							+ '.png" /><label for="appName" class="imtip">'
							+ data.appInfraRiskScore
							+ '</label></div></td></tr></tbody></table></td></tr></table></br></br></br></br></br><table style="width: 650px; height: 100px;"><tr><td style="width: 470px;"><table cellspacing="2" style="height: 100px; margin-left: 5%; background-color:; font-size: 12; font-weight: bold;" width="600px"><tbody><tr><td align="center"></td></tr><tr style="height: 24px;"><td align="center" colspan="3" rowspan="3"><div><img src="images/security_'
							+ data.appSecurityRiskColor
							+ '_'
							+ data.appSecurityRiskCategory
							+ '.png" /><label for="appName" class="imtip">'
							+ data.appSecurityRiskScore
							+ '</label></div></td></tr></tbody></table></td></tr></table></br></br></br></br></br><table style="width: 650px; height: 100px;"><tr><td style="width: 470px;"><table cellspacing="2" style="height: 100px; margin-left: 5%; background-color:; font-size: 12; font-weight: bold;" width="600px"><tbody><tr><td align="center"></td></tr><tr style="height: 24px;"><td align="center" colspan="3" rowspan="3"><div><img src="images/people_'
							+ data.appPeopleRiskColor
							+ '_'
							+ data.appPeopleRiskCategory
							+ '.png" /><label for="appName" class="imtip">'
							+ data.appPeopleRiskScore
							+ '</label></div></td></tr></tbody></table></td></tr></table></br></br></br></br></br></div></div>';    
					            
           	$('#screen2Right').append(recalSectionDIV);
           	setTimeout(function(){           		
           		$("#modelWindow").css("display","none");
           	},1500);
           	}
 });       
}

function loadRecalcSection(value){	
	
	//console.log("value:"+arr[value - 1]);
	$("#screen1").hide();
	$("#screen2Left").empty();
	$("#screen2Right").empty();
	
	screentwoLefthtml = '<form id="riskScoreform"><div class="center_content"><div class="divTable1"><table style="height: 110px; margin-right: auto; margin-left: 12px; margin-top: 1%; font-size: 13; font-weight: bold;" width="400"><tbody><tr style="height: 15px;"><td>Application ID :</td><td><label name="appId+"><b>'
		+ arr.appId
		+ '</b></p></td></tr><tr style="height: 15px;"><td>Application Name :</td><td><label name="appName"><b>'
		+ arr.appName
		+ '</b></label></td></tr><tr style="height: 15px;"><td>Application Category :</td><td style="font-weight: bold;"><label name="appCategory"><b>'
		+ arr.appCategory
		+ '</b></label></td></tr><tr style="height: 15px;"><td>Support Scope:</td><td style="font-weight: bold;"><label name="supportScope"><b>'
		+ arr.supportScope
		+ '</b></label></td></tr><tr><td></td></tr></tbody></table><a href="#"><img style="margin-left: 52%;" width: 100px; height: 35px; top: 15px; left: 980px;" src="images/calcButton.png" alt="Re-Calculate" onclick="reCalculateRiskScore();return false;" /></a><div class="divTableBody"><div class="divTableRow1"><div class="divTableCell"><table style="width: 650px; height: 210px;"><tr><td style="width: 470px;"><table cellspacing="2" style="height: 210px; margin-left: 5%; background-color: #fff2cc; font-size: 12; font-weight: bold;" width="600px"><tbody><tr style="height: 15px;"><td align="center" colspan="2" style="margin-left: 4%;">Application Stability Index</td></tr><tr style="height: 15px;"><td align="left">&nbsp;Application Age</td><td align="right"><select name="ageInYears"><option selected="selected">'
		+ arr.ageInYears
		+ '</option><option>> 2 years</option><option>> 5 years</option><option>> 10 years</option><option>> 15 years</option><option>> 25 years</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Number of Releases/UBR</td><td align="right"><input name="noReleaseUbr" id="noReleaseUbr" type="number" value='
		+ arr.noReleaseUbr
		+ ' /></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Number of Tickets Volume</td><td align="right"><input name="noTktsVlm" type="number" id="noTktsVlm" value='
		+ arr.noTktsVlm
		+ ' /></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Number of Sev1\Sev2</td><td align="right"><input name="noSev1Sev2" type="number" id="noSev1Sev2" value='
		+ arr.noSev1Sev2
		+ ' /></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Number of Incident Tickets</td><td align="right"><input name="noIncTkt" id="noIncTkt" type="number" value='
		+ arr.noIncTkt
		+ ' /></td></tr><tr style="height: 15px;"><td align="left">&nbsp;No. Of SRT"s\Issue Bridges directly attributed to Application</td><td align="right"><input name="noSrtCount" type="number" id="noSrtCount" value='
		+ arr.noSrtCount
		+ ' /></td></tr><tr style="height: 15px;"><td align="left">&nbsp;No. of Tickets resolved with Vendor support (3rd Party like<br>Axway etc) </td><td align="right"><select name="noTktRslvVendor" id="noTktRslvVendor"><option selected="selected">'
		+ arr.noTktRslvVendor
		+ '</option><option>No</option><option>Medium < 5 Tickets/Year</option><option>High > 5 Tickets/Year</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Manual Intervention/Production Support in Effort/Day</td><td align="right"><select name="manualIntervension" id="manualIntervension"><option selected="selected">'
		+ arr.manualIntervension
		+ '</option><option>Low < 2 Hours/Day</option><option>Medium <4 Hours/Day</option><option>High >4 Hours/Day</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Number ofOut of Office Hour callouts (2015)</td><td align="right"><input name="noOutofoffCallouts" type="number" id="noOutofoffCallouts" value='
		+ arr.noOutofoffCallouts
		+ ' /></td></tr></tbody></table></td></tr></table></br><table style="width: 650px; height: 100px;"><tbody><tr><td style="width: 470px;"><table style="height: 100px; margin-left: 5%; background-color: #fff2cc; font-size: 12; font-weight: bold;" width="600px"><tbody><tr style="height: 15px;"><td align="center" colspan="2">&nbsp;Application Complexity Index</td></tr><tr style="height: 15px;"><td align="left">&nbsp;Number of Interfacing applications</td><td align="right"><input name="noInterfacApp" id="noInterfacApp" type="number" value='
		+ arr.noInterfacApp
		+ ' /></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Data Volume /Transaction per day</td><td align="right"><select name="dataVolumeDay" id="dataVolumeDay"><option selected="selected">'
		+ arr.dataVolumeDay
		+ '</option><option>Low < 50K Txns</option><option>Medium > 50K Txns to 1 Mn Txns</option><option>High >1M Txns</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Technology and Support Availability</td><td align="right"><select name="techSuprtAvlbt" id="techSuprtAvlbt"><option selected="selected">'
		+ arr.techSuprtAvlbt
		+ '</option><option>Web & Support Available</option><option>Web & Support Unavailable</option><option>Legacy & Support Available</option><option>Legacy & Support Unavailable</option><option>Niche & Support Available</option><option>Niche & Support Unavailable</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Code Availability</td><td align="right"><select name="codeAvlbt" id="codeAvlbt"><option selected="selected">'
		+ arr.codeAvlbt
		+ '</option><option>Partial</option><option>Yes</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;% Increase in data volume/Year</td><td align="right"><select name="increaDataVlmYr" id="increaDataVlmYr"><option selected="selected">'
		+ arr.increaDataVlmYr
		+ '</option><option>Low < 3%</option><option>Medium 3% to 8%</option><option>High > 8%</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Regulatory Compliance</td><td align="right"><select name="regCompliance" id="regCompliance"><option selected="selected">'
		+ arr.regCompliance
		+ '</option><option>Yes</option><option>No</option></select></td></tr></tbody></table></td></tr></tbody></table></br><table style="width: 650px; height: 100px;"><tbody><tr><td style="width: 470px;"><table style="height: 100px; margin-left: 5%; background-color: #fff2cc; font-size: 12; font-weight: bold;" width="600"><tbody><tr style="height: 15px;"><td align="center" colspan="2">&nbsp;Impact and Recovery Index</td></tr><tr style="height: 15px;"><td align="left">&nbsp;Revenue Impact</td><td align="right"><select name="revImpact" id="revImpact"><option selected="selected">'
		+ arr.revImpact
		+ '</option><option>Direct & Immediate Revenue Impact</option><option>Indirect Revenue Impact</option><option>No Revenue Impact</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Impact to Customer</td><td align="right"><select name="impatcToCustomer" id="impatcToCustomer"><option selected="selected">'
		+ arr.impatcToCustomer
		+ '</option><option>High > 50 Users</option><option>Medium - 10 to 50 users</option><option>Low < 10 users</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Recovery Duration (App./SW/Infra.)</td><td align="right"><select name="recoveryDuration" id="recoveryDuration"><option selected="selected">'
		+ arr.recoveryDuration
		+ '</option><option>4 to 12 Hours</option><option>12 Hours to 1 Day</option><option>> 1 Day</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Impact to Upstream / Downstream Apps</td><td align="right"><select name="impactUpDnStream" id="impactUpDnStream"><option selected="selected">'
		+ arr.impactUpDnStream
		+ '</option><option>> 5 systems</option><option>< 5 systems</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Impact to Brand Image</td><td align="right"><select name="impactBrandImg" id="impactBrandImg"><option selected="selected">'
		+ arr.impactBrandImg
		+ '</option><option>Yes</option><option>No</option></select></td></tr></tbody></table></td></tr></tbody></table></br><table style="width: 650px; height: 100px;"><tbody><tr><td style="width: 470px;"><table style="height: 100px; margin-left: 5%; background-color: #BCDEE8; font-size: 12; font-weight: bold;" width="600"><tbody><tr style="height: 15px;"><td align="center" colspan="2">Infra. Risk</td></tr><tr style="height: 15px;"><td align="left">&nbsp;Application Performance SLA</td><td align="right"><select name="appPerfSla" id="appPerfSla"><option selected="selected">'
		+ arr.appPerfSla
		+ '</option><option>Above defined SLA</option><option>Below SLA</option><option>Met SLA</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Scalability/Capacity Related Issues</td><td align="right"><select name="scalability" id="scalability"><option selected="selected">'
		+ arr.scalability
		+ '</option><option>Yes</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Obsolete Infrastructure</td><td align="right"><select name="obsoleteInfra" id="obsoleteInfra"><option selected="selected">'
		+ arr.obsoleteInfra
		+ '</option><option>Yes</option><option>No</option><option>Partial</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;DR Environment Availability</td><td align="right"><select name="drEnvAvlbt" id="drEnvAvlbt"><option selected="selected">'
		+ arr.drEnvAvlbt
		+ '</option><option>Yes</option><option>No</option><option>Partial</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Network / Infrastructure issues per month</td><td align="right"><select name="nwInfraIssuePm" id="nwInfraIssuePm"><option selected="selected">'
		+ arr.nwInfraIssuePm
		+ '</option><option>> 5</option><option>> 2 and < 5</option><option>< 2</option></select></td></tr></tbody></table></td></tr></tbody></table></br><table style="width: 650px; height: 100px;"><tbody><tr><td style="width: 470px;"><table style="height: 100px; margin-left: 5%; background-color: #BCDEE8; font-size: 12; font-weight: bold;" width="600"><tbody><tr style="height: 15px;"><td align="center" colspan="2">Security. Risk</td></tr><tr style="height: 15px;"><td align="left">&nbsp;Security Vulnerability (Code)</td><td align="right"><select name="secVlnbtyCode" id="secVlnbtyCode"><option selected="selected">'
		+ arr.secVlnbtyCode
		+ '</option><option>Yes - High Priority issues</option><option>Yes - Medium/Low Priority issues</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Security Vulnerability (Infra)</td><td align="right"><select name="secVlnbtyInfra" id="secVlnbtyInfra"><option selected="selected">'
		+ arr.secVlnbtyInfra
		+ '</option><option>Yes - High Priority issues</option><option>Yes - Medium/Low Priority issues</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Compliance Related Vulnerabilities</td><td align="right"><select name="compVlnblts" id="compVlnblts"><option selected="selected">'
		+ arr.compVlnblts
		+ '</option><option>Yes - High Priority issues</option><option>Yes - Medium/Low Priority issues</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Conf. Mgmt Availability</td><td align="right"><select name="confMgtVlnbty" id="confMgtVlnbty"><option selected="selected">'
		+ arr.confMgtVlnbty
		+ '</option><option>Yes</option><option>No</option><option>Partial</option></select></td></tr></tbody></table></td></tr></tbody></table></br><table style="width: 650px; height: 100px;"><tbody><tr><td style="width: 470px;"><table style="height: 100px; margin-left: 5%; background-color: #BCDEE8; font-size: 12; font-weight: bold;" width="600"><tbody><tr style="height: 15px;"><td align="center" colspan="2">People. Risk</td></tr><tr style="height: 15px;"><td align="left">&nbsp;SME Availability</td><td align="right"><select name="smeAvlbt"><option selected="selected">'
		+ arr.smeAvlbt
		+ '</option><option>Yes - 1 SME</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Vendor Expertise(Cognizant Availability)</td><td align="right"><select name="vendorExptCts"><option selected="selected">'
		+ arr.vendorExptCts
		+ '</option><option>Yes</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Vendor Expertise(Ensono Availability)</td><td align="right"><select name="vendorExptEnsono"><option selected="selected">'
		+ arr.vendorExptEnsono
		+ '</option><option>Yes</option><option>No</option></select></td></tr><tr style="height: 15px;"><td align="left">&nbsp;Availability Business Users</td><td align="right"><select name="avlbtBizUsers"><option selected="selected">'
		+ arr.avlbtBizUsers
		+ '</option><option>Yes</option><option>No</option></select></td></tr></tbody></table></td></tr></tbody></table></br><a href="#"><img style="margin-left: 65%;" width: 100px; height: 35px; top: 15px; left: 980px;" src="images/calcButton.png" alt="Re-Calculate" onclick="reCalculateRiskScore();return false;" /></a></div><div class="divTableCell3"><br><br><br><br><table style="margin-left: 20px; margin-top: 100px; height: 27px;" width="100%"><tbody></tbody></table></div></div></div></div></div></form>';


	screentwoRighthtml = '<div id="riskScoreImageDiv2"><div class="divTableCell"></br></br></br></br></br></br></br></br></br></br><table style="width: 65px; height: 100px;margin-top:20%;"><tr><td style="width: 47px;"><table style="height: 100px; margin-left: 5%; background-color:; font-size: 12; font-weight: bold;" width="600px"><tbody><tr style="height: 24px;"><td align="center" colspan="3" rowspan="3"><div><img src="images/app_'
		+ arr.appRiskMaintColor
		+ '_'
		+ arr.appRiskMaintCategory
		+ '.png" /><label for="appName" class="imtip">'
		+ arr.appRiskMaintScore
		+ '</label></div></td></tr></tbody></table></td></tr></table></br></br></br></br></br><table style="width: 650px; height: 100px;"><tr><td style="width: 470px;"><table cellspacing="2" style="height: 100px; margin-left: 5%; background-color:; font-size: 12; font-weight: bold;" width="600px"><tbody><tr><td align="center"></td></tr><tr style="height: 24px;"><td align="center" colspan="3" rowspan="3"><div><img src="images/infra_'
		+ arr.appInfraRiskColor
		+ '_'
		+ arr.appInfraRiskCategory
		+ '.png" /><label for="appName" class="imtip">'
		+ arr.appInfraRiskScore
		+ '</label></div></td></tr></tbody></table></td></tr></table></br></br></br></br></br><table style="width: 650px; height: 100px;"><tr><td style="width: 470px;"><table cellspacing="2" style="height: 100px; margin-left: 5%; background-color:; font-size: 12; font-weight: bold;" width="600px"><tbody><tr><td align="center"></td></tr><tr style="height: 24px;"><td align="center" colspan="3" rowspan="3"><div><img src="images/security_'
		+ arr.appSecurityRiskColor
		+ '_'
		+ arr.appSecurityRiskCategory
		+ '.png" /><label for="appName" class="imtip">'
		+ arr.appSecurityRiskScore
		+ '</label></div></td></tr></tbody></table></td></tr></table></br></br></br></br></br><table style="width: 650px; height: 100px;"><tr><td style="width: 470px;"><table cellspacing="2" style="height: 100px; margin-left: 5%; background-color:; font-size: 12; font-weight: bold;" width="600px"><tbody><tr><td align="center"></td></tr><tr style="height: 24px;"><td align="center" colspan="3" rowspan="3"><div><img src="images/people_'
		+ arr.appPeopleRiskColor
		+ '_'
		+ arr.appPeopleRiskCategory
		+ '.png" /><label for="appName" class="imtip">'
		+ arr.appPeopleRiskScore
		+ '</label></div></td></tr></tbody></table></td></tr></table></br></div></div>';
		
	$("#screen2Left").append(screentwoLefthtml);
	$("#screen2Right").append(screentwoRighthtml);
	$('#screen2Left').show();
	$('#screen2Right').show();
}


//DETAILS VIEW WORKAROUND
//WRITE ANOTHER NG-CLICK WHICH WILL GET THE APPNAME AND EXTRACT THE ROW FROM THE $SCOPE VARIABLE AND PASS IT TO 
//THE loadRecalcSection TO RENDER THE DETAILS PAGE
