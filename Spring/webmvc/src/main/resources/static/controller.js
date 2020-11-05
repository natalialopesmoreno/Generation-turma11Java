var app = angular.module('myApp', []);

app.controller('myCtrl', function($scope, $http) {

  $scope.manutencao = new Object();


$scope.salvar = function() {
  $http.post("http://localhost:8080/manutencao", {
    'id':$scope.id,
    'nome':$scope.nome,
    'categoria':$scope.categoria,
    'data':$scope.data
    
  })
  };   

});