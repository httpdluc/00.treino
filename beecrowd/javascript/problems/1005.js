export const problem = (lines) => {
    
    const [nA, nB] = lines;
    
    const pA = 3.5;
    const pB = 7.5;

    const res = (nA * pA + nB * pB) / (pA + pB);

    console.log(`MEDIA = ${res.toFixed(5)}`);
}