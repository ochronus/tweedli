
define([
  'jquery',
  'underscore',
  'backbone',
  'views/TweetInputView',
  'text!/assets/templates/MainTemplate.html',
  'jquery_textarea'
], function($, _, BackBone, TweetInputView, homeTemplate){

  var MainView = BackBone.View.extend({
    el: $("#tweedli_container"),

    render: function(){

      this.$el.html(homeTemplate);
      var tiw = new TweetInputView();
      this.$el.append(tiw.render());
      $('#input_tweet').textareaCount({maxCharacterSize: 140,
             			originalStyle: 'originalTextareaInfo',
             			warningStyle: 'warningTextareaInfo',
             			warningNumber: 120,
             			displayFormat: '#left Characters Left'});
    }

  });

  return MainView;

});