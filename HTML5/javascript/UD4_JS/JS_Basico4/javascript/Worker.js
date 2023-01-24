class Worker {

    dni;
    name;
    age;

    constructor(dni, name, age) {
        this.dni = dni;
        this.name = name;
        this.age = age;
    }

    get dni() {
        return this.dni;
    }

    set dni(value) {
        this.dni = value;
    }

    get name() {
        return this.name;
    }

    set name(value) {
        this.name = value;
    }

    get age() {
        return this.age;
    }

    set age(value) {
        this.age = value;
    }

    createWorker() {
        return `Nombre: ${this.name} <br>
                Edad: ${this.age} <br>
                DNI: ${this.dni}`;
    }
}

class Boss extends Worker {

    section;

    constructor(dni, name, age, section) {
        super(dni, name, age);
        this.section = section;
    }

    get section() {
        return this.section;
    }

    set section(value) {
        this.section = value;
    }

    createBoss() {
        return `Nombre: ${this.name} <br>
                Edad: ${this.age} <br>
                DNI: ${this.dni} <br>
                Sector: ${this.section}`;
    }
}

class Autonomo extends Worker {

    id;

    constructor(dni, name, age, id) {
        super(dni, name, age);
        this.id = id;
    }

    get id() {
        return this.id;
    }
    set id(value) {
        this.id = value;
    }

    createAutonomo() {
        return `Nombre: ${this.name} <br>
                Edad: ${this.age} <br>
                DNI: ${this.dni} <br>
                ID: ${this.id}`;
    }
}

function bosses() {

    var visibility = document.getElementById("bosses");

    if (visibility.style.display === "none") {
        visibility.style.display = "block";
    } else {
        visibility.style.display = "none";
    }

    let boss1 = new Boss("5555555A", "Paco Pepe", 32, "B");
    let boss2 = new Boss("45371658B", "Mamadou Mas", 23, "T");

    var bossesArray = new Array(boss1, boss2);

    let text = "<h2>JEFES</h2><br>";

    bossesArray.forEach(boss => {
        text += "<div class = 'boss'>" + boss.createBoss() + "</div>";
    });

    document.getElementById("bosses").innerHTML = text;
}

function autonomos() {

    var visibility = document.getElementById("autonomos");

    if (visibility.style.display === "none") {
        visibility.style.display = "block";
    } else {
        visibility.style.display = "none";
    }

    let aut1 = new Autonomo("6666666A", "Marcos Heredia", 50, "1233456789A");

    var autonomosArray = new Array(aut1);

    let text = "<h2>AUTÓNOMOS</h2><br>";

    autonomosArray.forEach(autonomo => {
        text += "<div class = 'autonomo'>" + autonomo.createAutonomo() + "</div>";
    });

    document.getElementById("autonomos").innerHTML = text;
}

function workers() {

    var visibility = document.getElementById("workers");

    if (visibility.style.display === "none") {
        visibility.style.display = "block";
    } else {
        visibility.style.display = "none";
    }

    let worker1 = new Worker("44444445A", "Alessandro Lapini López", 24);
    let worker2 = new Worker("43051555Z", "Miguel Ángel Alonso", 23);
    let worker3 = new Worker("43051455S", "Adrián Matemales", 23);

    var workersArray = new Array(worker1, worker2, worker3);

    let text = "<h2>TRABAJADORES</h2><br>";

    workersArray.forEach(worker => {
        text += "<div class = 'worker'>" + worker.createWorker() + "</div>";
    });

    document.getElementById("workers").innerHTML = text;
}