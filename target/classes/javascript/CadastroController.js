/**
 * 
 */
var CadastroControllerApp = angular.module("CadastroControllerApp",[])
CadastroControllerApp.controller("CadastroController", function($scope,$http,$window){	
	$scope.CPF = null,
	$scope.RG = null,
	$scope.Nome = null,
	$scope.SobreNome = null,
	$scope.Email = null,
	$scope.Trabalho = null,
	$scope.CargaHr = null;
	
	$scope.AlterarPessoa = function(){
		
		var Pessoa = new Object();
		Pessoa.CPF = $scope.CPF,
		Pessoa.RG = $scope.RG,
		Pessoa.Nome = $scope.Nome,
		Pessoa.SobreNome = $scope.Sobrenome,
		Pessoa.Email = $scope.email,
		Pessoa.Trabalho = $scope.trabalho,
		Pessoa.CargaHr = $scope.CargaHr;
		
		
	}
	
}