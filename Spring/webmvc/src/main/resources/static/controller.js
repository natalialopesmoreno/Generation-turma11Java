var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
	$scope.manutencao = new Object();
	$scope.salvar = function() {
		$http.post("http://localhost:8080/manutencao", {
			'id' : $scope.id,
			'nome' : $scope.nome,
			'categoria' : $scope.categoria,
			'data' : $scope.data,
			'pago' : $scope.pago
		})
	};



	$scope.put = function(){
		$http.put("http://localhost:8080/manutencao/" + $scope.id,{
		'nome': $scope.nome,
		'categoria' : $scope.categoria,
		'data' : $scope.data,
		'pago': $scope.pago
		
		})
}

	$scope.delete = function(){
		   
		   
		   $http.delete("http://localhost:8080/manutencao/"+$scope.id);
		  }
		  
		  
		$scope.anosIntervalos = function(){
			$http.get("http://localhost:8080/manutencao/teste")
		    .then(function(resposta) {
		  	$scope.manutencao = resposta.data; 
		 });
		  }
		
		 $scope.anosIntervalos();
		 
		 
		 
		 
		 $scope.buscarTodos = function() {
		$http.get("http://localhost:8080/manutencao").then(function(resposta) {
			$scope.manutencao = resposta.data;
		});
	}

$scope.buscarTodos();


		  
	

});