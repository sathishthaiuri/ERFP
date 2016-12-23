'use strict';

myApp.factory('myAppSrvc',['$http', '$rootScope', 
	function($http, $rootScope){
		return {
			getAppListSrvc:function(){
                return $http({
                    method: "GET",
                    url: "listApplicationRecords",
                    data: {
                        "method" : 'listApplicationRecords'
                    },
                    headers: {
                        'Content-Type': 'application/json'
                    }
                }).then(function successCallback(response) {
                    $rootScope.isModel = false;
                       return response.data;
                    },
                    function errorCallback(response) {
                       alert("Please check the backend/network connectivity");
                    });
            },
            reCalRiskScoreSrvc:function ($scope){
                $rootScope.isModel = true;
                var jsonText=JSON.stringify($('#riskScoreform').serialize());
                return $http({
                    method: "POST",
                    url: "scoreRecalculation",
                    data: jsonText,
                    headers: {
                        'Content-Type': 'application/json'
                    }
                }).then(function successCallback(response) {
                    $rootScope.isModel = false;
                    $scope.appData = response.data;
                },
                function errorCallback(response) {
                   alert("Please check the backend/network connectivity");
                   $rootScope.isModel = false;
                   
                });
            }
        }
    }
]);    
