window.onload = function () {
  document.getElementById("button").addEventListener("click", login);

  document.getElementById("password").addEventListener("keyup", function (e) {
    if (e.key === "Enter") login();
  });
};
function login() {
  let username = document.getElementById("username").value;
  let password = document.getElementById("password").value;
  let errorContainer = document.getElementById("error-message");

  if (username && password) {
    //errorContainer.setAttribute("hidden", true);

    fetch("http://localhost:8080/cartoon-data-app/authentication", {
      method: "POST",
      body: JSON.stringify({ username, password }),
    }).then((resp) => {
      if (resp.status == 200) {
        let successMsgContainer = document.createElement("p");
        successMsgContainer.setAttribute("class", "alert alert-success");
        successMsgContainer.innerText = "Login successful! Redirecting...";
        document.getElementById("loginform").appendChild(successMsgContainer);
      } else {
        errorContainer.removeAttribute("hidden");
        errorContainer.innerText =
          "Invalid credentials. Please check your input and try again.";
      }
    });
  }
}
