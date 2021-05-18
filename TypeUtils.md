## Changes to `TypeUtils`
```
  public static Map<String, TypeMirror> getXmlElements(
      GenerationContext context, VariableElement element, Class clazz) {
    Map<String, TypeMirror> result = new HashMap<>();
    context.getProcessingEnv().getElementUtils().getAllAnnotationMirrors(element).stream()
        .filter(elm -> elm.getAnnotationType().toString().equals(clazz.getCanonicalName()))
        .forEach(
            e ->
                e.getElementValues()
                    .forEach(
                        (a1, a2) ->
                            new SimpleAnnotationValueVisitor8<
                                AnnotationValue, Map<String, TypeMirror>>() {
                              @Override
                              public AnnotationValue visitArray(
                                  List<? extends AnnotationValue> z, Map<String, TypeMirror> map) {
                                for (AnnotationValue annotationValue : z) {
                                  new SimpleAnnotationValueVisitor8<
                                      AnnotationValue, Map<String, TypeMirror>>() {
                                    @Override
                                    public AnnotationValue visitAnnotation(
                                        AnnotationMirror a, Map<String, TypeMirror> map) {
                                      String name = null;
                                      TypeMirror value = null;
                                      for (Map.Entry<
                                              ? extends ExecutableElement,
                                              ? extends AnnotationValue>
                                          entry : a.getElementValues().entrySet()) {
                                        if (entry
                                            .getKey()
                                            .getSimpleName()
                                            .toString()
                                            .equals("name")) {
                                          name = entry.getValue().getValue().toString();
// Filter on "type" too                 } else if (entry
                                            .getKey()
                                            .getSimpleName()
                                            .toString()
                                            .equals("type")) {
                                          value = (TypeMirror) entry.getValue().getValue();
                                        }
                                      }
// Null checks incase no match        if (name != null && value != null) {
                                        map.put(name, value);
                                      }
                                      return null;
                                    }
                                  }.visit(annotationValue, map);
                                }
                                if (z.size() == 1) {
                                  return null;
                                }

                                return z.get(1);
                              }
                            }.visit(a2, result)));
    return result;
  }
```
