// Last updated: 3/26/2026, 1:47:29 AM
function createHelloWorld() {
    
    return function(...args): string {
        return "Hello World";
    };
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */