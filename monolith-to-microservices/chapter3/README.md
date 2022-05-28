## Chapter 3
- `hr-app`: It is a simple react web app that consumes the monolith's API. You can use this application to demonstrate the impact changes in the API.
- `monolith`: This is the monolith in which you should apply the patterns.

## Strangler Fig
Use the following branches to implement the patterns:
- `apply-strangler-fig`. The final implementation is at `answer-strangler-fig`.

### Goal
Your goal is to split the payroll from the monolith to a new API. The aim is to reduce the impact in the hr-app, try to avoid downtime and changes in it.

### Step by step
1. Add a proxy server
   1. Suggestion is to use the nginx server. Are you stuck? [have a look here.](https://docs.nginx.com/nginx/admin-guide/web-server/reverse-proxy/)