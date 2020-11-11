var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
	$scope.psicologa = new Object();
	$scope.salvar = function() {
		$http.post("http://localhost:8080/psicologa", {
			'id' : $scope.id,
			'nome' : $scope.nome,
			'email' : $scope.email,
			'cpf' : $scope.cpf,
			'crp' : $scope.crp,
			'telefone': $scope.telefone
		})
	};
	
	$scope.buscarTodos = function() {
		$http.get("http://localhost:8080/psicologa").then(function(resposta) {
			$scope.psicologa = resposta.data;
		});
	}
$scope.buscarTodos();



});