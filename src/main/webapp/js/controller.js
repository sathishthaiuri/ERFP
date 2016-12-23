'use strict';
var app = angular.module('myApp.appList', ['ngRoute'])
app.controller('appListCtrl', ['$scope','$rootScope','getAppList', function($scope,$rootScope,getAppList) {
    $scope.sortType = 'appId';
    $scope.reverse = false;
    $scope.sortBy = function(sortType) {
        console.log("before " + $scope.sortType + " " + $scope.reverse);
        $scope.reverse = ($scope.sortType === sortType) ? !$scope.reverse : false;
        $scope.sortType = sortType;
        console.log("after " + $scope.sortType + " " + $scope.reverse);
    };
    $rootScope.appRecordLists = getAppList;
    $scope.showSearchFields = function(){
        $scope.showSearch =  !$scope.showSearch;
    }
}]);
app.controller('appDetailsCtrl', ['$scope','$rootScope','$routeParams','getAppList', 'myAppSrvc', function($scope,$rootScope,$routeParams,getAppList,myAppSrvc) {
    $scope.id = $routeParams.id;
    $scope.appData = {};
    if($rootScope.appRecordLists == undefined){
        $rootScope.appRecordLists = getAppList
    }
    for(var i=0,n=$rootScope.appRecordLists.length;i<n;i++){
        var row = $rootScope.appRecordLists[i];
        if(row.appId == $scope.id){
            $scope.appData = row;
            break;
        }
    }
    $scope.reCalculateRiskScore = function (){
        myAppSrvc.reCalRiskScoreSrvc($scope);
    }
}]);