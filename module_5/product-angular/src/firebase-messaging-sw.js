importScripts('https://www/.gstatic.com/firebasejs/8.0.0/firebase-app.js');
importScripts('https://www/.gstatic.com/firebasejs/8.0.0/firebase-messaging.js');

firebase.initializeApp({
  apiKey: "AIzaSyBSoUt-Kz8CzIEtD6QX9wS5mH9Tq5KuwbY",
  authDomain: "test-push-notification-509a2.firebaseapp.com",
  projectId: "test-push-notification-509a2",
  storageBucket: "test-push-notification-509a2.appspot.com",
  messagingSenderId: "915257226033",
  appId: "1:915257226033:web:93473649e2ce10cf19f610",
  measurementId: "G-1WYBJL8VL0"
})
const messaging = firebase.messaging();
