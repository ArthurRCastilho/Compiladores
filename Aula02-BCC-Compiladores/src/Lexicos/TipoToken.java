package Lexicos;

// Definindo tipos de token => Que é definido após definir sua gramática

public enum TipoToken {
    PCDeclaracoes, PCAlgoritmo, PCInteiro, PCAtribuir, PCImprimir,
    // Palavras Chaves
    PCInicio, PCSe, PCEntao, PCFim, PCEnquanto,
    // Operadores
    OprAritMult, OprAritDiv, OprAritSoma, OprAritSub, OpRelMenor, OprRelMenorIgual, OprRelMaior, OprRelMaiorIgual,
    OprRelIgual, OprRelDiferete, OprBoolE, OprBoolOum, Deliminitador, AbrePar, FechaPar, NumInt, NumReal, Fim,
    Cadeia
}
