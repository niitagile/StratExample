var Rectangle = /** @class */ (function () {
    function Rectangle() {
        this._length = 0;
        this._breath = 0;
    }
    Object.defineProperty(Rectangle.prototype, "length", {
        get: function () {
            return this._length;
        },
        set: function (v) {
            this._length = v;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Rectangle.prototype, "breath", {
        get: function () {
            return this._breath;
        },
        set: function (v) {
            this._breath = v;
        },
        enumerable: false,
        configurable: true
    });
    return Rectangle;
}());
var rect = new Rectangle();
//call setters
rect.length = 20;
rect.breath = 10;
console.log("length=" + rect.length);
console.log("breadth=" + rect.breath);
