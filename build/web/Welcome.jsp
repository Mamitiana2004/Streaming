<%-- 
    Document   : Index
    Created on : 16 mai 2022, 22:23:48
    Author     : P14A-01-Faneva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
        <link rel="stylesheet" href="/Servlet/assets/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="/Servlet/assets/css/Welcome.css">
    </head>
    <body>
       <svg xmlns="http://www.w3.org/2000/svg" style="display: none;">
            <symbol id="facebook" viewBox="0 0 16 16">
              <path d="M16 8.049c0-4.446-3.582-8.05-8-8.05C3.58 0-.002 3.603-.002 8.05c0 4.017 2.926 7.347 6.75 7.951v-5.625h-2.03V8.05H6.75V6.275c0-2.017 1.195-3.131 3.022-3.131.876 0 1.791.157 1.791.157v1.98h-1.009c-.993 0-1.303.621-1.303 1.258v1.51h2.218l-.354 2.326H9.25V16c3.824-.604 6.75-3.934 6.75-7.951z"/>
            </symbol>
            <symbol id="instagram" viewBox="0 0 16 16">
                <path d="M8 0C5.829 0 5.556.01 4.703.048 3.85.088 3.269.222 2.76.42a3.917 3.917 0 0 0-1.417.923A3.927 3.927 0 0 0 .42 2.76C.222 3.268.087 3.85.048 4.7.01 5.555 0 5.827 0 8.001c0 2.172.01 2.444.048 3.297.04.852.174 1.433.372 1.942.205.526.478.972.923 1.417.444.445.89.719 1.416.923.51.198 1.09.333 1.942.372C5.555 15.99 5.827 16 8 16s2.444-.01 3.298-.048c.851-.04 1.434-.174 1.943-.372a3.916 3.916 0 0 0 1.416-.923c.445-.445.718-.891.923-1.417.197-.509.332-1.09.372-1.942C15.99 10.445 16 10.173 16 8s-.01-2.445-.048-3.299c-.04-.851-.175-1.433-.372-1.941a3.926 3.926 0 0 0-.923-1.417A3.911 3.911 0 0 0 13.24.42c-.51-.198-1.092-.333-1.943-.372C10.443.01 10.172 0 7.998 0h.003zm-.717 1.442h.718c2.136 0 2.389.007 3.232.046.78.035 1.204.166 1.486.275.373.145.64.319.92.599.28.28.453.546.598.92.11.281.24.705.275 1.485.039.843.047 1.096.047 3.231s-.008 2.389-.047 3.232c-.035.78-.166 1.203-.275 1.485a2.47 2.47 0 0 1-.599.919c-.28.28-.546.453-.92.598-.28.11-.704.24-1.485.276-.843.038-1.096.047-3.232.047s-2.39-.009-3.233-.047c-.78-.036-1.203-.166-1.485-.276a2.478 2.478 0 0 1-.92-.598 2.48 2.48 0 0 1-.6-.92c-.109-.281-.24-.705-.275-1.485-.038-.843-.046-1.096-.046-3.233 0-2.136.008-2.388.046-3.231.036-.78.166-1.204.276-1.486.145-.373.319-.64.599-.92.28-.28.546-.453.92-.598.282-.11.705-.24 1.485-.276.738-.034 1.024-.044 2.515-.045v.002zm4.988 1.328a.96.96 0 1 0 0 1.92.96.96 0 0 0 0-1.92zm-4.27 1.122a4.109 4.109 0 1 0 0 8.217 4.109 4.109 0 0 0 0-8.217zm0 1.441a2.667 2.667 0 1 1 0 5.334 2.667 2.667 0 0 1 0-5.334z"/>
            </symbol>
            <symbol id="twitter" viewBox="0 0 16 16">
              <path d="M5.026 15c6.038 0 9.341-5.003 9.341-9.334 0-.14 0-.282-.006-.422A6.685 6.685 0 0 0 16 3.542a6.658 6.658 0 0 1-1.889.518 3.301 3.301 0 0 0 1.447-1.817 6.533 6.533 0 0 1-2.087.793A3.286 3.286 0 0 0 7.875 6.03a9.325 9.325 0 0 1-6.767-3.429 3.289 3.289 0 0 0 1.018 4.382A3.323 3.323 0 0 1 .64 6.575v.045a3.288 3.288 0 0 0 2.632 3.218 3.203 3.203 0 0 1-.865.115 3.23 3.23 0 0 1-.614-.057 3.283 3.283 0 0 0 3.067 2.277A6.588 6.588 0 0 1 .78 13.58a6.32 6.32 0 0 1-.78-.045A9.344 9.344 0 0 0 5.026 15z"/>
            </symbol>
        </svg>
        
        <header>
  <div class="cssNav collapse bg-dark" id="navbarHeader">
    <div class="container">
      <div class="row">
        <div class="col-sm-8 col-md-7 py-4">
          <h4 class="cssNav text-white">About</h4>
          <p class="cssNav text-muted">for more information</p>
        </div>
        <div class="col-sm-4 offset-md-1 py-4">
          <h4 class="cssNav text-white">Contact :</h4>
          <ul class="list-unstyled">
              <li><a href="#" style="text-decoration: none;" class="cssNav text-white"><svg width="20" height="20" fill="#183A37"><use xlink:href="#twitter"/></svg><span>  </span>Follow on Twitter</a></li>
              <li><a href="#" style="text-decoration: none;" class="cssNav text-white"><svg width="20" height="20" fill="#183A37"><use xlink:href="#instagram"/></svg><span>  </span>Follow on Insta</a></li>
              <li><a href="#" style="text-decoration: none;" class="cssNav text-white"><svg width="20" height="20" fill="#183A37"><use xlink:href="#facebook"/></svg><span>  </span>Like on Facebook</a></li>
          </ul>
        </div>
      </div>
    </div>
  </div>
  <div class="cssNav navbar navbar-dark bg-dark shadow-sm">
    <div class="container">
      <a href="#" class="cssNav navbar-brand d-flex align-items-center">
          <strong>VidStream</strong>
      </a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarHeader" aria-controls="navbarHeader" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
    </div>
  </div>
</header>
        
        <center><div>
              <svg data-v-fde0c5aa="" width="450" heigth="300" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 300 300" class="iconAboveSlogan"><!----><defs data-v-fde0c5aa=""><!----></defs><rect data-v-fde0c5aa="" fill="transparent" x="0" y="0" width="300px" height="300px" class="logo-background-square"></rect><defs data-v-fde0c5aa=""><!----></defs><g data-v-fde0c5aa="" id="314e02d0-ac0a-43ee-98a7-e704b295b79c" fill="#183A37" transform="matrix(3.879439115524292,0,0,3.879439115524292,19.728439257100902,134.13852499210756)"><path d="M0.07 8.43L2.87 8.43L4.28 14.49L4.41 14.49L5.82 8.43L8.62 8.43L6.52 17.18L2.17 17.18L0.07 8.43ZM9.31 17.18L9.31 17.18ZM9.39 10.53L12.19 10.18L12.19 17.18L9.39 17.18L9.39 10.53ZM10.79 9.59L10.79 9.59Q10.21 9.59 9.89 9.46L9.89 9.46L9.89 9.46Q9.58 9.34 9.44 9.02L9.44 9.02L9.44 9.02Q9.31 8.71 9.31 8.12L9.31 8.12L9.31 8.12Q9.31 7.27 9.63 6.94L9.63 6.94L9.63 6.94Q9.94 6.62 10.79 6.62L10.79 6.62L10.79 6.62Q11.63 6.62 11.95 6.94L11.95 6.94L11.95 6.94Q12.26 7.27 12.26 8.12L12.26 8.12L12.26 8.12Q12.26 8.69 12.13 9.01L12.13 9.01L12.13 9.01Q12.00 9.32 11.69 9.46L11.69 9.46L11.69 9.46Q11.38 9.59 10.79 9.59L10.79 9.59ZM17.72 8.08L20.52 7.87L20.52 17.18L19.12 17.18L18.61 16.48L18.61 16.48Q17.88 17.39 16.32 17.39L16.32 17.39L16.32 17.39Q14.76 17.39 14.04 16.50L14.04 16.50L14.04 16.50Q13.31 15.61 13.31 13.68L13.31 13.68L13.31 13.68Q13.31 11.75 14.04 10.86L14.04 10.86L14.04 10.86Q14.76 9.97 16.32 9.97L16.32 9.97L16.32 9.97Q17.12 9.97 17.72 10.21L17.72 10.21L17.72 8.08ZM17.18 15.29L17.18 15.29Q17.49 15.29 17.61 15.20L17.61 15.20L17.61 15.20Q17.72 15.12 17.72 14.90L17.72 14.90L17.72 12.07L16.87 12.07L16.87 12.07Q16.56 12.07 16.44 12.15L16.44 12.15L16.44 12.15Q16.32 12.24 16.32 12.46L16.32 12.46L16.32 15.29L17.18 15.29ZM21.97 14.57L21.97 14.57Q23.37 15.02 24.81 15.02L24.81 15.02L24.81 15.02Q25.52 15.02 25.94 14.95L25.94 14.95L25.94 14.18L24.68 14.07L24.68 14.07Q23.59 13.97 22.94 13.67L22.94 13.67L22.94 13.67Q22.29 13.37 21.99 12.81L21.99 12.81L21.99 12.81Q21.70 12.25 21.70 11.35L21.70 11.35L21.70 11.35Q21.70 10.18 22.04 9.50L22.04 9.50L22.04 9.50Q22.37 8.82 23.12 8.52L23.12 8.52L23.12 8.52Q23.87 8.22 25.19 8.22L25.19 8.22L25.19 8.22Q26.91 8.22 28.48 8.64L28.48 8.64L28.13 10.88L28.13 10.88Q27.40 10.72 26.89 10.66L26.89 10.66L26.89 10.66Q26.39 10.60 25.86 10.60L25.86 10.60L25.86 10.60Q25.14 10.60 24.71 10.67L24.71 10.67L24.71 11.42L25.72 11.52L25.72 11.52Q27.43 11.69 28.19 12.37L28.19 12.37L28.19 12.37Q28.95 13.05 28.95 14.39L28.95 14.39L28.95 14.39Q28.95 15.95 28.06 16.67L28.06 16.67L28.06 16.67Q27.16 17.39 25.23 17.39L25.23 17.39L25.23 17.39Q23.24 17.39 21.57 16.88L21.57 16.88L21.97 14.57ZM34.05 11.98L33.08 11.98L33.08 15.18L33.08 15.18Q33.49 15.25 33.91 15.27L33.91 15.27L33.78 17.16L33.78 17.16Q32.84 17.39 32.09 17.39L32.09 17.39L32.09 17.39Q31.16 17.39 30.72 17.02L30.72 17.02L30.72 17.02Q30.28 16.65 30.28 15.86L30.28 15.86L30.28 11.98L29.58 11.98L29.58 10.18L30.28 10.18L30.28 9.06L33.08 8.36L33.08 10.18L34.05 10.18L34.05 11.98ZM36.50 10.18L37.27 11.10L37.27 11.10Q38.09 10.23 39.34 9.97L39.34 9.97L39.51 12.68L39.51 12.68Q39.19 12.71 38.65 12.90L38.65 12.90L38.65 12.90Q38.12 13.09 37.90 13.24L37.90 13.24L37.90 17.18L35.10 17.18L35.10 10.18L36.50 10.18ZM43.99 15.34L43.99 15.34Q45.15 15.34 46.48 14.98L46.48 14.98L46.82 16.91L46.82 16.91Q45.37 17.39 43.71 17.39L43.71 17.39L43.71 17.39Q41.80 17.39 40.90 16.48L40.90 16.48L40.90 16.48Q40.00 15.58 40.00 13.68L40.00 13.68L40.00 13.68Q40.00 11.76 40.89 10.86L40.89 10.86L40.89 10.86Q41.79 9.97 43.71 9.97L43.71 9.97L43.71 9.97Q45.00 9.97 45.70 10.19L45.70 10.19L45.70 10.19Q46.40 10.40 46.70 10.91L46.70 10.91L46.70 10.91Q47.00 11.42 47.00 12.35L47.00 12.35L47.00 12.35Q47.00 13.20 46.61 13.71L46.61 13.71L46.61 13.71Q46.21 14.21 45.35 14.43L45.35 14.43L45.35 14.43Q44.49 14.66 43.01 14.66L43.01 14.66L43.01 15.29L43.01 15.29Q43.30 15.34 43.99 15.34L43.99 15.34ZM43.97 12.00L43.97 12.00Q43.43 12.00 43.22 12.11L43.22 12.11L43.22 12.11Q43.01 12.22 43.01 12.53L43.01 12.53L43.01 13.26L43.51 13.26L43.51 13.26Q44.06 13.26 44.27 13.13L44.27 13.13L44.27 13.13Q44.48 13.01 44.48 12.67L44.48 12.67L44.48 12.00L43.97 12.00ZM51.62 9.97L51.62 9.97Q53.28 9.97 54.06 10.56L54.06 10.56L54.06 10.56Q54.84 11.14 54.84 12.42L54.84 12.42L54.84 17.18L53.44 17.18L52.74 16.48L52.74 16.48Q52.21 16.93 51.60 17.16L51.60 17.16L51.60 17.16Q50.99 17.39 50.36 17.39L50.36 17.39L50.36 17.39Q49.08 17.39 48.50 16.81L48.50 16.81L48.50 16.81Q47.91 16.24 47.91 15.01L47.91 15.01L47.91 15.01Q47.91 14.15 48.27 13.65L48.27 13.65L48.27 13.65Q48.64 13.15 49.44 12.92L49.44 12.92L49.44 12.92Q50.25 12.70 51.62 12.70L51.62 12.70L52.04 12.70L52.04 12.07L52.04 12.07Q51.83 12.01 51.34 12.01L51.34 12.01L51.34 12.01Q50.04 12.01 48.57 12.38L48.57 12.38L48.23 10.44L48.23 10.44Q49.80 9.97 51.62 9.97L51.62 9.97ZM51.07 15.50L51.07 15.50Q51.62 15.50 51.83 15.39L51.83 15.39L51.83 15.39Q52.04 15.27 52.04 14.97L52.04 14.97L52.04 14.10L51.45 14.10L51.45 14.10Q50.90 14.10 50.69 14.22L50.69 14.22L50.69 14.22Q50.48 14.35 50.48 14.69L50.48 14.69L50.48 15.50L51.07 15.50ZM64.99 9.97L64.99 9.97Q65.97 9.97 66.53 10.39L66.53 10.39L66.53 10.39Q67.09 10.82 67.09 11.58L67.09 11.58L67.09 17.18L64.29 17.18L64.29 12.28L63.57 12.28L63.57 12.28Q63.28 12.28 63.15 12.37L63.15 12.37L63.15 12.37Q63.03 12.46 63.03 12.67L63.03 12.67L63.03 17.18L60.23 17.18L60.23 12.28L59.51 12.28L59.51 12.28Q59.22 12.28 59.09 12.37L59.09 12.37L59.09 12.37Q58.97 12.46 58.97 12.67L58.97 12.67L58.97 17.18L56.17 17.18L56.17 10.18L57.57 10.18L58.27 10.88L58.27 10.88Q59.53 9.97 60.93 9.97L60.93 9.97L60.93 9.97Q61.54 9.97 62.00 10.14L62.00 10.14L62.00 10.14Q62.45 10.30 62.71 10.63L62.71 10.63L62.71 10.63Q63.78 9.97 64.99 9.97L64.99 9.97Z"></path></g><defs data-v-fde0c5aa=""><!----></defs><g data-v-fde0c5aa="" id="1489049d-2a99-4e3f-a430-23e29e16c4f4" stroke="none" fill="#183A37" transform="matrix(0.9899738430976868,0,0,0.9899738430976868,102.48125599967105,62.62250517147204)"><path d="M46.508 49.757c-.166-.116-.508-.025-.508.146v8.193c0 .172.332.262.498.147l5.943-4.097c.113-.079.094-.215-.019-.293l-5.914-4.096z"></path><path d="M82.207 41.757c.016-.369.028-.74.028-1.113C82.235 27.033 71.188 16 57.56 16c-9.869 0-18.381 5.788-22.327 14.149a13.458 13.458 0 0 0-7.832-2.488c-7.295 0-13.208 5.714-13.208 12.762 0 1.046.133 2.063.379 3.035C6.251 45.229 0 52.766 0 61.781 0 72.109 8.208 80 18.333 80h60.123C88.145 80 96 71.715 96 60.901c0-9.379-5.907-17.226-13.793-19.144zM64 60.33A3.67 3.67 0 0 1 60.33 64H37.67A3.67 3.67 0 0 1 34 60.33V47.67A3.67 3.67 0 0 1 37.67 44h22.66A3.67 3.67 0 0 1 64 47.67v12.66z"></path></g><defs data-v-fde0c5aa=""><!----></defs><g data-v-fde0c5aa="" id="c9074b97-b4d6-4df3-9a96-60c36d7f7df0" fill="#123750" transform="matrix(0.9462803602218628,0,0,0.9462803602218628,51.970082998089545,209.28358283295594)"><path d="M0.94 9.74L0.56 9.90C1.19 11.77 2.24 12.71 3.71 12.71C4.62 12.71 5.32 12.45 5.78 11.93C6.25 11.41 6.48 10.77 6.48 10.01C6.48 9.66 6.42 9.35 6.31 9.06C6.19 8.78 6.06 8.55 5.92 8.37C5.77 8.19 5.57 8.02 5.31 7.86C5.04 7.70 4.83 7.58 4.67 7.50C4.51 7.43 4.28 7.34 4.00 7.22C3.97 7.21 3.85 7.16 3.65 7.08C3.46 7.01 3.34 6.96 3.29 6.94C3.24 6.91 3.14 6.87 2.97 6.80C2.80 6.73 2.69 6.67 2.64 6.64C2.59 6.60 2.50 6.54 2.37 6.45C2.24 6.37 2.15 6.30 2.10 6.24C2.05 6.18 1.99 6.10 1.90 6.00C1.82 5.90 1.76 5.80 1.73 5.70C1.70 5.61 1.67 5.50 1.64 5.38C1.61 5.25 1.60 5.12 1.60 4.98C1.60 4.41 1.79 3.95 2.19 3.62C2.59 3.29 3.08 3.12 3.67 3.12C4.80 3.12 5.58 3.77 6.02 5.07L6.43 4.90C6.22 4.23 5.88 3.69 5.42 3.29C4.95 2.89 4.37 2.69 3.68 2.69C2.99 2.69 2.39 2.90 1.88 3.33C1.37 3.76 1.12 4.33 1.12 5.04C1.12 5.39 1.19 5.71 1.34 5.99C1.48 6.27 1.70 6.51 1.98 6.71C2.27 6.91 2.52 7.07 2.75 7.17C2.98 7.28 3.28 7.41 3.64 7.55C3.92 7.65 4.11 7.72 4.21 7.77C4.32 7.82 4.49 7.90 4.73 8.02C4.97 8.13 5.15 8.24 5.26 8.34C5.36 8.45 5.49 8.58 5.63 8.75C5.78 8.92 5.88 9.11 5.94 9.32C5.99 9.54 6.02 9.78 6.02 10.05C6.02 10.72 5.83 11.27 5.45 11.68C5.08 12.09 4.51 12.29 3.75 12.29C2.52 12.29 1.58 11.44 0.94 9.74ZM15.93 7.48L20.27 7.48L20.27 7.08L15.93 7.08L15.93 3.21L20.55 3.21L20.55 2.80L15.51 2.80L15.51 12.60L20.55 12.60L20.55 12.19L15.93 12.19ZM30.35 7.48L34.69 7.48L34.69 7.08L30.35 7.08L30.35 3.21L34.97 3.21L34.97 2.80L29.93 2.80L29.93 12.60L34.97 12.60L34.97 12.19L30.35 12.19ZM58.77 2.45L54.50 12.60L54.99 12.60L56.27 9.52L61.28 9.52L62.55 12.60L63.04 12.60ZM58.77 3.50L61.08 9.07L56.46 9.07ZM78.44 2.80L78.44 11.79L70.95 2.45L70.95 12.60L71.37 12.60L71.37 3.61L78.86 12.95L78.86 2.80ZM87.82 2.80L87.82 12.60L90.20 12.60C91.62 12.60 92.76 12.15 93.61 11.25C94.47 10.35 94.89 9.17 94.89 7.70C94.89 6.23 94.47 5.05 93.61 4.15C92.76 3.25 91.62 2.80 90.20 2.80ZM88.24 3.22L90.20 3.22C91.50 3.22 92.53 3.63 93.30 4.46C94.06 5.28 94.44 6.37 94.44 7.70C94.44 9.09 94.07 10.18 93.31 10.98C92.55 11.78 91.52 12.18 90.20 12.18L88.24 12.18ZM114.73 9.74L114.35 9.90C114.98 11.77 116.03 12.71 117.50 12.71C118.42 12.71 119.11 12.45 119.57 11.93C120.04 11.41 120.27 10.77 120.27 10.01C120.27 9.66 120.22 9.35 120.10 9.06C119.98 8.78 119.85 8.55 119.71 8.37C119.56 8.19 119.36 8.02 119.10 7.86C118.84 7.70 118.62 7.58 118.46 7.50C118.30 7.43 118.08 7.34 117.80 7.22C117.76 7.21 117.64 7.16 117.45 7.08C117.25 7.01 117.13 6.96 117.08 6.94C117.04 6.91 116.93 6.87 116.76 6.80C116.59 6.73 116.48 6.67 116.43 6.64C116.38 6.60 116.29 6.54 116.16 6.45C116.03 6.37 115.94 6.30 115.89 6.24C115.85 6.18 115.78 6.10 115.70 6.00C115.61 5.90 115.55 5.80 115.52 5.70C115.49 5.61 115.46 5.50 115.43 5.38C115.40 5.25 115.39 5.12 115.39 4.98C115.39 4.41 115.59 3.95 115.98 3.62C116.38 3.29 116.87 3.12 117.46 3.12C118.59 3.12 119.37 3.77 119.81 5.07L120.22 4.90C120.01 4.23 119.68 3.69 119.21 3.29C118.74 2.89 118.16 2.69 117.47 2.69C116.78 2.69 116.18 2.90 115.68 3.33C115.17 3.76 114.91 4.33 114.91 5.04C114.91 5.39 114.98 5.71 115.13 5.99C115.27 6.27 115.49 6.51 115.77 6.71C116.06 6.91 116.31 7.07 116.54 7.17C116.77 7.28 117.07 7.41 117.43 7.55C117.71 7.65 117.90 7.72 118.01 7.77C118.11 7.82 118.28 7.90 118.52 8.02C118.77 8.13 118.94 8.24 119.05 8.34C119.16 8.45 119.28 8.58 119.43 8.75C119.57 8.92 119.67 9.11 119.73 9.32C119.78 9.54 119.81 9.78 119.81 10.05C119.81 10.72 119.62 11.27 119.25 11.68C118.87 12.09 118.30 12.29 117.54 12.29C116.31 12.29 115.37 11.44 114.73 9.74ZM129.30 2.80L129.30 12.60L129.72 12.60L129.72 7.62L135.95 7.62L135.95 12.60L136.37 12.60L136.37 2.80L135.95 2.80L135.95 7.18L129.72 7.18L129.72 2.80ZM145.82 2.80L145.82 9.24C145.82 10.29 146.11 11.13 146.68 11.77C147.25 12.42 148.00 12.74 148.95 12.74C149.89 12.74 150.64 12.42 151.21 11.77C151.78 11.13 152.07 10.29 152.07 9.24L152.07 2.80L151.65 2.80L151.65 9.24C151.65 10.17 151.39 10.92 150.89 11.47C150.38 12.02 149.73 12.29 148.95 12.29C148.16 12.29 147.52 12.02 147.01 11.47C146.50 10.92 146.24 10.17 146.24 9.24L146.24 2.80ZM160.54 3.21L163.06 3.21L163.06 12.60L163.48 12.60L163.48 3.21L166.00 3.21L166.00 2.80L160.54 2.80ZM185.67 2.80L185.67 9.24C185.67 10.29 185.95 11.13 186.52 11.77C187.09 12.42 187.85 12.74 188.79 12.74C189.73 12.74 190.49 12.42 191.06 11.77C191.63 11.13 191.91 10.29 191.91 9.24L191.91 2.80L191.49 2.80L191.49 9.24C191.49 10.17 191.24 10.92 190.73 11.47C190.22 12.02 189.57 12.29 188.79 12.29C188.01 12.29 187.36 12.02 186.85 11.47C186.34 10.92 186.09 10.17 186.09 9.24L186.09 2.80ZM201.36 2.80L201.36 12.60L201.78 12.60L201.78 8.48L203.46 8.48C204.42 8.48 205.19 8.23 205.77 7.73C206.34 7.22 206.63 6.53 206.63 5.64C206.63 4.76 206.34 4.06 205.77 3.56C205.19 3.05 204.42 2.80 203.46 2.80ZM201.78 3.21L203.46 3.21C204.32 3.21 204.99 3.41 205.47 3.83C205.95 4.24 206.19 4.85 206.19 5.64C206.19 6.44 205.95 7.04 205.47 7.45C204.99 7.87 204.32 8.08 203.46 8.08L201.78 8.08Z"></path></g></svg>
              <div class="afficheMessage"><p class="text" id="message">Bienvenue </p></div>
              
                    <hr class="my-4">
                    <p><a href="Admin/Login.jsp"><button  class="button" id="btn_admin">Admin</button></a>  <a href="Client/Login.jsp"><button id="btn_login" class="button">Client</button></a></p>
        </div></center>
        
    <div class="container">
        <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
          <div class="col-md-4 d-flex align-items-center">
            <span class="mb-3 mb-md-0 text-muted">&copy; 2022 VidStream</span>
          </div>

          
        </footer>
    </div>
    <script src="/Servlet/assets/dist/js/bootstrap.bundle.min.js"></script>
    <script src="/Servlet/assets/js/Welcome.js"></script>
    </body>
</html>