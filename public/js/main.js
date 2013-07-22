requirejs.config({
  paths: {
    "jquery": 'lib/jquery/jquery-min',
    "underscore": 'lib/underscore/underscore-min',
    "backbone": 'lib/backbone/backbone-min',
    'bootstrap': ['//netdna.bootstrapcdn.com/twitter-bootstrap/2.2.1/js/bootstrap.min', 'libs/bootstrap-min'],
    'jquery_textarea': 'lib/jquery/jquery.textareaCounter.plugin'
  },
  shim: {
            "backbone": {
              "deps": ["underscore", "jquery"],
              "exports": "Backbone"
            },
            'bootstrap' : ['jquery']
        }
});



require([
  // Load our app module and pass it to our definition function
  'app',

], function(App){
  // The "app" dependency is passed in as "App"
  // Again, the other dependencies passed in are not "AMD" therefore don't pass a parameter to this function
  App.initialize();
});