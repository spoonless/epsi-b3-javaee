function createToc() {
	if (document.getElementById("toc")) {
		var titles = document.getElementsByTagName("h2")
		var toc = ""
		for (var i = 0; i < titles.length; ++i) {
			if (! titles[i].id) {
				titles[i].id = "t" + i
			}
			toc += "<li><a href='#" + titles[i].id + "'>" + titles[i].innerHTML + "</a></li>"
		}
		document.getElementById("toc").innerHTML = "<ol>" + toc  + "</ol>"
	}
}
window.addEventListener("load", createToc)
