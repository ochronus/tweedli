define([
  'underscore',
  'backbone',
], function(_, Backbone) {

  var TweetModel = Backbone.Model.extend({
    urlRoot: "/tweets",
  	defaults : {
  	}

  });

  return TweetModel;

});