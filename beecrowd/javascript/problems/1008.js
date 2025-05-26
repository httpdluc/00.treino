export const problem = (lines) => {
    
    const [n, h, vH] = lines.map(Number);

    const sal = h * vH;

    console.log(`NUMBER = ${n}\nSALARY = ${sal.toFixed(2)}`);
}