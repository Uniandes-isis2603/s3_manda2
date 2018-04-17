(function (ng) {
    
    var mod = ng.module("clienteModule", ['ui.router']);
    
    mod.config(['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {
            
            var basePath = 'src/modules/clientes/';
            
            $urlRouterProvider.otherwise("/clientesList");
            
            $stateProvider.state('clientesList', {
                
                url: '/clientes/list',
                 views: {
                    'mainView': {
                        templateUrl: basePath + 'clientes.list.html',
                        controller: 'clienteCtrl',
                        controllerAs: 'ctrl'
                    }
                }
            }).state('clienteDetail', {
                url: '/cliente/detail',
                views: {
                    'mainView': {
                        templateUrl: basePath + 'cliente.detail.html',
                        controller: 'clienteDetailCtrl',
                        controllerAs: 'ctrl'
                    }
                }

            });
        }
    ]);
})(window.angular);
