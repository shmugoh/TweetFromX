// require('twitter-api-v2');
const { TwitterApi } = require('twitter-api-v2');

const twt_client = new TwitterApi({
    appKey: 'y7Vud2NYaJ62fPmLcuUgoOMbx',
    appSecret: 'k8Ec4tavkowLoQXq4ompkZHGytYqr2n34zGdFjZz9Dn7dkZdlG',
    accessToken: '2828399391-4n4uF6zIX7GHpyXAvSReZHXrISAjgAkY9wwW2YE',
    accessSecret: 'e44IkrfN50NnHNiNr4Qung3ZqEpyCAOhlnr56Ui0z9zc7',
  });

twt_client.v1.tweet('test no.2');