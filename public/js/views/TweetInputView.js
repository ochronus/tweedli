
define([
  'jquery',
  'underscore',
  'backbone',
  'models/Tweet',
  'text!/assets/templates/TweetInputView.html'
], function($, _, BackBone, TweetModel, tiwTemplate){

  var TweetInputView = BackBone.View.extend({
    el: $('#tweedli_container'),

    events: {
      "click #submit_tweet" : "submitTweet"
    },

    render: function(){
      return(tiwTemplate);
    },

    submitTweet: function(e) {
        var tm = new TweetModel({tweet: $('#input_tweet').val()});
        tm.save();
    }

  });

  return TweetInputView;

});