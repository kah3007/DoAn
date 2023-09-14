function muaFun() {
    let soLuong = document.getElementById("tron1").innerText;
    soLuong = Math.floor(soLuong) + 1;
    document.getElementById("tron1").innerText = soLuong;                    
    document.getElementById("alert").style.display = "block";
}  
function muaFun1() {
    document.getElementById("name").value = "";             
    document.getElementById("sdt").value = "";                          
    document.getElementById("diachi").value = "";  
    document.getElementById("option-1").checked = false;
    document.getElementById("option-2").checked = false;
    document.getElementById("def2").selected = true;
    document.getElementById("def1").selected = true;
    document.getElementById("def3").selected = true;
    document.getElementById("alert").style.display = "block";
    window.location  = "index.html";
}  