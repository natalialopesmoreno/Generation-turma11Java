var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
	$scope.paciente = new Object();
	
	$scope.salvar = function() {
		$http.post("http://localhost:8080/paciente", {
			'id' : $scope.id,
			'nome' : $scope.nome,
			'email' : $scope.email,
			'cpf' : $scope.cpf,
			'telefone': $scope.telefone,
			'psicologa':{
					'id':$scope.psicologa
					}
							
		})
	};
	
	$scope.buscarTodos = function() {
		$http.get("http://localhost:8080/paciente").then(function(resposta) {
			$scope.paciente = resposta.data;
		});
	}
$scope.buscarTodos();



		$scope.put = function(){
		$http.put("http://localhost:8080/paciente/" + $scope.id,{
			'nome' : $scope.nome,
			'email' : $scope.email,
			'cpf' : $scope.cpf,
			'telefone': $scope.telefone,
			'psicologa':{
					'id':$scope.psicologa
					}
		
		})
		
		};

		$scope.delete = function(){
		   $http.delete("http://localhost:8080/paciente/"+$scope.id);
		  }




});