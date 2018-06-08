#Author: gzduran@bancolombia.com.co
@tag
Feature: Ingreso al sistema

  @Registro
  Scenario Outline: Ingresar a la aplicacion OrangeHRM
    Given que Ingreso a la pagina web de OrangeHRM
    When Diligencio los campos de registro
      | <usuario> | <paswword> |
    Then Verifico el ingreso exitoso
      | <usuario> |

    Examples: 
      | usuario | paswword |
      | Admin   | admin    |

  @CamposRequeridos
  Scenario Outline: Verificar campos requeridos
    Given que Ingreso a la pagina web de OrangeHRM
    When Diligencio los campos de registro
      | <usuario> | <password> |
    And se adiciona un nuevo usuario
      | <usuario> | <user> | <passworduser> |
    Then Verifico el mensaje
      | <mensaje> |

    Examples: 
      | usuario | password | user  | paswworduser | mensaje |
      | Admin   | admin    | Zulay |         1234 | Invalid |
