var Role = {
	PM: "PM",
	DEV: "DEV",
	QA: "QA"
};

var Salary = {
	PM: 6000,
	DEV: 5000,
	QA: 4000
}
	
var employees = [{id: 1, name: "Laura", role: Role.PM, address: {location: "Pfalzgasse 1, Zurich", country: "Switzerland"}},
		  		 {id: 2, name: "Julien",role: Role.DEV,address: {location:null, country: "France"}},
				 {id: 3, name: "David", role: Role.QA, address: null},
				 {id: 4, name: "Simon", role: null, address: {location: "2 Rue Germain Pilon, Paris", country: "France"}}];


function padLeft (str, max) {
	var pad = " ".repeat(max);
	return (pad + str).slice(-pad.length);
}

function showHeader() {
	console.log(padLeft("Name",  10), padLeft("Address", 35), padLeft("Country", 20), padLeft("Salary", 20))
	console.log("--".repeat(50));
}

showHeader();
employees.forEach(function(employee){
	var location;
	var country;
	var salary;
  
	var address = employee.address;
	if (address != null) {
		location = address.location;
		country = address.country;
	}
	
	console.log(padLeft(employee.name,  10), padLeft("|", 5), padLeft(location, 30), padLeft("|", 5), padLeft(country, 15), padLeft("|", 5), padLeft(salary, 15))	
});