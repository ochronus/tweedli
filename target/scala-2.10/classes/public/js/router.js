define([
  'jquery',
  'underscore',
  'backbone',
  'views/MainView'
], function($, _, Backbone, MainView) {

  var AppRouter = Backbone.Router.extend({
    routes: {
      // Define some URL routes
      'projects': 'showProjects',
      'users': 'showContributors',

      // Default
      '*actions': 'defaultAction'
    }
  });

  var initialize = function(){
    var mainView = new MainView();
    mainView.render();

    Backbone.history.start();
  };
  return {
    initialize: initialize
  };
});