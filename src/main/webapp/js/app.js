'use strict';

var myApp = angular.module('myApp', ['ngRoute', 'myApp.appList', 'ui.bootstrap']);

myApp.config(['$locationProvider', '$routeProvider', function($locationProvider, $routeProvider) {
    $locationProvider.hashPrefix('!');
    $routeProvider.when('/appList', {
        templateUrl: 'partials/app-list.html',
        controller: 'appListCtrl',
        resolve: {
            getAppList:function(myAppSrvc){
                return myAppSrvc.getAppListSrvc();
            }
        }
    });
    $routeProvider.when('/appDetails/:id', {
        templateUrl: 'partials/app-details.html',
        controller: 'appDetailsCtrl',
        resolve: {
            getAppList:function(myAppSrvc){
                return myAppSrvc.getAppListSrvc();
            }
        }
    });
    $routeProvider.otherwise({redirectTo: '/appList'});
    
}]);
myApp.run(function ($rootScope){
    $rootScope.isModel = true; 
})
