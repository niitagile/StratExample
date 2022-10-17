var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Employee1 = /** @class */ (function () {
    function Employee1(id, name) {
        this.empid = 0;
        this.empname = "";
        this.empid = id;
        this.empname = name;
    }
    Object.defineProperty(Employee1.prototype, "eid", {
        get: function () {
            return this.empid;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Employee1.prototype, "ename", {
        get: function () {
            return this.empname;
        },
        enumerable: false,
        configurable: true
    });
    return Employee1;
}());
var RegEmployee = /** @class */ (function (_super) {
    __extends(RegEmployee, _super);
    function RegEmployee(id, name, salary) {
        var _this = _super.call(this, id, name) || this;
        _this.salary = 0;
        _this.salary = salary;
        return _this;
    }
    Object.defineProperty(RegEmployee.prototype, "sal", {
        get: function () {
            return this.salary;
        },
        enumerable: false,
        configurable: true
    });
    return RegEmployee;
}(Employee1));
var remp = new RegEmployee(1, 'Manika', 8978);
console.log("empid=" + remp.eid);
console.log("name=" + remp.ename);
console.log("salary=" + remp.sal);
